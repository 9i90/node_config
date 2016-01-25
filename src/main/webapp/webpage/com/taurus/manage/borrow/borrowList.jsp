<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="borrowList" title="借款表" actionUrl="borrowController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="项目编号" field="borrowId"   width="120"></t:dgCol>
   <t:dgCol title="用户ID" field="userId"   width="120"></t:dgCol>
   <t:dgCol title="标题" field="name"   width="120"></t:dgCol>
   <t:dgCol title="状态" field="status"   width="120"></t:dgCol>
   <t:dgCol title="排序" field="sort"   width="120"></t:dgCol>
   <t:dgCol title="点击次数" field="hits"   width="120"></t:dgCol>
   <t:dgCol title="产品类型" field="productType"   width="120"></t:dgCol>
   <t:dgCol title="发布时间" field="publish" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="计息方式【1：放款计息；2：投标计息】" field="interestType"   width="120"></t:dgCol>
   <t:dgCol title="自动截标额度【仅限于好友贷使用，截至标的有效时间(valid_time)还未满标，达到此额度自动截标并放款】" field="autoCutTap"   width="120"></t:dgCol>
   <t:dgCol title="标的份额" field="lot"   width="120"></t:dgCol>
   <t:dgCol title="每份单价" field="price"   width="120"></t:dgCol>
   <t:dgCol title="还款总额" field="repaymentAccount"   width="120"></t:dgCol>
   <t:dgCol title="满标时间" field="successTime" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="截至时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="用途" field="purpose"   width="120"></t:dgCol>
   <t:dgCol title="借款期限" field="timeLimit"   width="120"></t:dgCol>
   <t:dgCol title="还款方式" field="style"   width="120"></t:dgCol>
   <t:dgCol title="借贷总金额" field="account"   width="120"></t:dgCol>
   <t:dgCol title="预期募集资金" field="accountWant"   width="120"></t:dgCol>
   <t:dgCol title="当前募集金额" field="accountNow"   width="120"></t:dgCol>
   <t:dgCol title="投资次数" field="tenderTime"   width="120"></t:dgCol>
   <t:dgCol title="年利率" field="apr"   width="120"></t:dgCol>
   <t:dgCol title="最低投标金额" field="lowestAccount"   width="120"></t:dgCol>
   <t:dgCol title="最多投标总额" field="mostAccount"   width="120"></t:dgCol>
   <t:dgCol title="投资金额倍数【用于投资人投标时的投资金额】" field="multipleAccount"   width="120"></t:dgCol>
   <t:dgCol title="有效时间" field="validTime" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="投标奖励" field="award"   width="120"></t:dgCol>
   <t:dgCol title="分摊奖励金额" field="partAccount"   width="120"></t:dgCol>
   <t:dgCol title="比例奖励的比例" field="funds"   width="120"></t:dgCol>
   <t:dgCol title="详细说明" field="content"   width="120"></t:dgCol>
   <t:dgCol title="提交时间" field="addtime" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="提交IP" field="addip"   width="120"></t:dgCol>
   <t:dgCol title="密码" field="pwd"   width="120"></t:dgCol>
   <t:dgCol title="0:天 1:月" field="isday"   width="120"></t:dgCol>
   <t:dgCol title="交易手续费" field="transactionfee"   width="120"></t:dgCol>
   <t:dgCol title="还款保证金" field="guaranteefee"   width="120"></t:dgCol>
   <t:dgCol title="交易管理费" field="managefee"   width="120"></t:dgCol>
   <t:dgCol title="抵押物类型：1=一般物品，2=汽车，3=房产" field="borrowType"   width="120"></t:dgCol>
   <t:dgCol title="项目编号" field="borrowCode"   width="120"></t:dgCol>
   <t:dgCol title="N：删除。Y：正常" field="validStatus"   width="120"></t:dgCol>
   <t:dgCol title="总期数" field="totalPeriod"   width="120"></t:dgCol>
   <t:dgCol title="易极付交易编号" field="yzzBorrowCode"   width="120"></t:dgCol>
   <t:dgCol title="是否定向：Y是；N否" field="isDirected"   width="120"></t:dgCol>
   <t:dgCol title="满标审核状态：0：未审核，1：审核通过，2：审核未通过" field="verifyStatus"   width="120"></t:dgCol>
   <t:dgCol title="借款企业名称 放款时生成借款合同所需数据 wy add at 20150115" field="borrowBusinessName"   width="120"></t:dgCol>
   <t:dgCol title="借款企业地址 放款时生成借款合同所需数据 wy add at 20150115" field="borrowBusinessAddr"   width="120"></t:dgCol>
   <t:dgCol title="借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第二天】放款成功时生成借款合同所需数据wy add at 20150115" field="starttimeLimit" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据wy add at 20150115" field="endtimeLimit" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="流标时间" field="loseTime" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="流标状态【1、自动流标；2、手动流标】" field="loseState"   width="120"></t:dgCol>
   <t:dgCol title="标的图片地址" field="picPath"   width="120"></t:dgCol>
   <t:dgCol title="模糊处理后的标的图片地址" field="mhpicPath"   width="120"></t:dgCol>
   <t:dgCol title="标的类型【1：标准化；2：T加零；3：好友贷】对应de_code_details标中的【SUBJECT_TYPE】" field="subjectType"   width="120"></t:dgCol>
   <t:dgCol title="标的热度 0：无热度显示；1：热 ；2：荐；" field="heat"   width="120"></t:dgCol>
   <t:dgCol title="所属借款对应的合同类型 目前是两种 01：普通借款三方合同；05：应收账款收益权转让协议" field="contractSort"   width="120"></t:dgCol>
   <t:dgCol title="原始借款企业名称" field="originalLoanBusiness"   width="120"></t:dgCol>
   <t:dgCol title="应收账款金额" field="receivableAccount"   width="120"></t:dgCol>
   <t:dgCol title="购销合同编号" field="purchasesSalesContractNo"   width="120"></t:dgCol>
   <t:dgCol title="销售合同编号" field="salesContractNo"   width="120"></t:dgCol>
   <t:dgCol title="国内保理合同编号1" field="factoringContractNo1"   width="120"></t:dgCol>
   <t:dgCol title="国内保理合同编号2" field="factoringContractNo2"   width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="borrowController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" id="lrat"  width="900" height="500" url="borrowController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="borrowController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="borrowController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>