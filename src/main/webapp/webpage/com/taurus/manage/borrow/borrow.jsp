<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>借款表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body >
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="borrowController.do?save">
			<input id="id" name="id" type="hidden" value="${borrowPage.id }">
			<table style="width: 100%;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							项目编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="borrowId" name="borrowId" 
							   value="${borrowPage.borrowId}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
					
					<td align="right">
						<label class="Validform_label">
							用户ID:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="userId" name="userId" ignore="ignore"
							   value="${borrowPage.userId}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							标题:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="name" name="name" ignore="ignore" datatype="s2-10" 
							   value="${borrowPage.name}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							状态:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="status" name="status" ignore="ignore"
							   value="${borrowPage.status}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							排序:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="sort" name="sort" ignore="ignore"
							   value="${borrowPage.sort}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							点击次数:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="hits" name="hits" ignore="ignore"
							   value="${borrowPage.hits}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							产品类型:
						</label>
					</td>
					<td class="value"> 
							   <t:dictSelect field="productType" typeGroupCode="BORROW_TYPE" hasLabel="false" defaultVal="${borrowPage.productType}"></t:dictSelect>
							   
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							发布时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="publish" name="publish" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.publish}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							计息方式:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="interestType" name="interestType" ignore="ignore"
							   value="${borrowPage.interestType}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							自动截标额度:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="autoCutTap" name="autoCutTap" ignore="ignore"
							   value="${borrowPage.autoCutTap}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							标的份额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="lot" name="lot" ignore="ignore"
							   value="${borrowPage.lot}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							每份单价:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="price" name="price" ignore="ignore"
							   value="${borrowPage.price}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							还款总额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="repaymentAccount" name="repaymentAccount" ignore="ignore"
							   value="${borrowPage.repaymentAccount}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							满标时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="successTime" name="successTime" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.successTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							截至时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="endTime" name="endTime" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.endTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							用途:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="purpose" name="purpose" ignore="ignore"
							   value="${borrowPage.purpose}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							借款期限:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="timeLimit" name="timeLimit" ignore="ignore"
							   value="${borrowPage.timeLimit}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							还款方式:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="style" name="style" ignore="ignore"
							   value="${borrowPage.style}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							借贷总金额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="account" name="account" ignore="ignore"
							   value="${borrowPage.account}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							预期募集资金:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="accountWant" name="accountWant" ignore="ignore"
							   value="${borrowPage.accountWant}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							当前募集金额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="accountNow" name="accountNow" ignore="ignore"
							   value="${borrowPage.accountNow}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							投资次数:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="tenderTime" name="tenderTime" ignore="ignore"
							   value="${borrowPage.tenderTime}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							年利率:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="apr" name="apr" ignore="ignore"
							   value="${borrowPage.apr}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							最低投标金额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="lowestAccount" name="lowestAccount" ignore="ignore"
							   value="${borrowPage.lowestAccount}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							最多投标总额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="mostAccount" name="mostAccount" ignore="ignore"
							   value="${borrowPage.mostAccount}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							投资金额倍数 :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="multipleAccount" name="multipleAccount" ignore="ignore"
							   value="${borrowPage.multipleAccount}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
			 
					<td align="right">
						<label class="Validform_label">
							有效时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="validTime" name="validTime" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.validTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
			 
					<td align="right">
						<label class="Validform_label">
							投标奖励:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="award" name="award" ignore="ignore"
							   value="${borrowPage.award}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							分摊奖励金额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="partAccount" name="partAccount" ignore="ignore"
							   value="${borrowPage.partAccount}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							比例奖励的比例:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="funds" name="funds" ignore="ignore"
							   value="${borrowPage.funds}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							详细说明:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="content" name="content" ignore="ignore"
							   value="${borrowPage.content}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							提交时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="addtime" name="addtime" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.addtime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							提交IP:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="addip" name="addip" ignore="ignore"
							   value="${borrowPage.addip}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							密码:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="pwd" name="pwd" ignore="ignore"
							   value="${borrowPage.pwd}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							0:天 1:月:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="isday" name="isday" ignore="ignore"
							   value="${borrowPage.isday}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							交易手续费:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="transactionfee" name="transactionfee" ignore="ignore"
							   value="${borrowPage.transactionfee}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							还款保证金:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="guaranteefee" name="guaranteefee" ignore="ignore"
							   value="${borrowPage.guaranteefee}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							交易管理费:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="managefee" name="managefee" ignore="ignore"
							   value="${borrowPage.managefee}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							抵押物类型 :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="borrowType" name="borrowType" ignore="ignore"
							   value="${borrowPage.borrowType}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							项目编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="borrowCode" name="borrowCode" ignore="ignore"
							   value="${borrowPage.borrowCode}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							N：删除。Y：正常:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="validStatus" name="validStatus" ignore="ignore"
							   value="${borrowPage.validStatus}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							总期数:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="totalPeriod" name="totalPeriod" ignore="ignore"
							   value="${borrowPage.totalPeriod}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							易极付交易编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="yzzBorrowCode" name="yzzBorrowCode" ignore="ignore"
							   value="${borrowPage.yzzBorrowCode}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							是否定向：Y是；N否:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="isDirected" name="isDirected" ignore="ignore"
							   value="${borrowPage.isDirected}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							满标审核状态 
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="verifyStatus" name="verifyStatus" ignore="ignore"
							   value="${borrowPage.verifyStatus}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							借款企业名称  
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="borrowBusinessName" name="borrowBusinessName" ignore="ignore"
							   value="${borrowPage.borrowBusinessName}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							借款企业地址  
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="borrowBusinessAddr" name="borrowBusinessAddr" ignore="ignore"
							   value="${borrowPage.borrowBusinessAddr}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							借款期限开始时间 
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="starttimeLimit" name="starttimeLimit" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.starttimeLimit}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							借款期限结束时间 
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="endtimeLimit" name="endtimeLimit" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.endtimeLimit}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							流标时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="loseTime" name="loseTime" ignore="ignore"
							     value="<fmt:formatDate value='${borrowPage.loseTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							流标状态 
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="loseState" name="loseState" ignore="ignore"
							   value="${borrowPage.loseState}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							标的图片地址:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="picPath" name="picPath" ignore="ignore"
							   value="${borrowPage.picPath}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							模糊处理后的标的图片地址:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="mhpicPath" name="mhpicPath" ignore="ignore"
							   value="${borrowPage.mhpicPath}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							标的类型 
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="subjectType" name="subjectType" ignore="ignore"
							   value="${borrowPage.subjectType}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							标的热度  :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="heat" name="heat" ignore="ignore"
							   value="${borrowPage.heat}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							 合同类型  :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="contractSort" name="contractSort" 
							   value="${borrowPage.contractSort}" datatype="*">
						<span class="Validform_checktip"></span>
					</td> 
					<td align="right">
						<label class="Validform_label">
							原始借款企业名称:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="originalLoanBusiness" name="originalLoanBusiness" ignore="ignore"
							   value="${borrowPage.originalLoanBusiness}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							应收账款金额:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="receivableAccount" name="receivableAccount" ignore="ignore"
							   value="${borrowPage.receivableAccount}" datatype="d">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							购销合同编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="purchasesSalesContractNo" name="purchasesSalesContractNo" ignore="ignore"
							   value="${borrowPage.purchasesSalesContractNo}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							销售合同编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="salesContractNo" name="salesContractNo" ignore="ignore"
							   value="${borrowPage.salesContractNo}">
						<span class="Validform_checktip"></span>
					</td>
				 
					<td align="right">
						<label class="Validform_label">
							国内保理合同编号1:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="factoringContractNo1" name="factoringContractNo1" ignore="ignore"
							   value="${borrowPage.factoringContractNo1}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							国内保理合同编号2:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="factoringContractNo2" name="factoringContractNo2" ignore="ignore"
							   value="${borrowPage.factoringContractNo2}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
		
		
 </body>