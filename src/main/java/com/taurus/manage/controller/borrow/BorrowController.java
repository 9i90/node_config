package com.taurus.manage.controller.borrow;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;
 
import com.taurus.manage.service.borrow.BorrowServiceI;
import com.taurus.soap.pojo.BorrowEntity;

/**   
 * @Title: Controller
 * @Description: 借款表
 * @author zhangdaihao
 * @date 2016-01-15 17:51:38
 * @version V1.0   
 *
 */
@Scope("prototype")
@Controller
@RequestMapping("/borrowController")
public class BorrowController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(BorrowController.class);

	@Autowired
	private BorrowServiceI borrowService;
	@Autowired
	private SystemService systemService;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * 借款表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "borrow")
	public ModelAndView borrow(HttpServletRequest request) {
		 
		return new ModelAndView("com/taurus/manage/borrow/borrowList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(BorrowEntity borrow,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BorrowEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, borrow, request.getParameterMap());
		this.borrowService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除借款表
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(BorrowEntity borrow, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		//borrow = systemService.getEntity(BorrowEntity.class, borrow.getId());
		borrow = systemService.getEntity(BorrowEntity.class, borrow.getBorrowId());
		message = "借款表删除成功";
		borrowService.delete(borrow);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加借款表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(BorrowEntity borrow, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(borrow.getBorrowId())) {
			message = "借款表更新成功";
			BorrowEntity t = borrowService.get(BorrowEntity.class, borrow.getBorrowId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(borrow, t);
				borrowService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "借款表更新失败";
			}
		} else {
			message = "借款表添加成功";
			borrowService.save(borrow);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 借款表列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(BorrowEntity borrow, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(borrow.getBorrowId())) {
			borrow = borrowService.getEntity(BorrowEntity.class, borrow.getBorrowId());
			req.setAttribute("borrowPage", borrow);
		}
		return new ModelAndView("com/taurus/manage/borrow/borrow");
	}
}
