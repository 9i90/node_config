package com.taurus.soap.service; 
import java.util.List;

import javax.jws.WebService;

import com.taurus.soap.pojo.BorrowEntity;
import com.taurus.soap.pojo.BorrowRepaymentEntity;
import com.taurus.soap.pojo.BorrowTenderEntity;
import com.taurus.soap.pojo.BorrowTransferEntity;
import com.taurus.soap.pojo.ContractEntity;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
@WebService   
public interface SOAPInvestmentService {

	/**
 	 * 方法描述:  投标
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param bTenderEntity
 	 * @param daijinquanId
 	 * @param jiaxiquanId
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject investmentBorrow(BorrowTenderEntity bTenderEntity,int daijinquanId, int jiaxiquanId);
	
	
	/**
 	 * 方法描述:  放款
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject loanBorrow(BorrowEntity bTenderEntity);
	
	

	/**
 	 * 方法描述:  还款
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject repaymentBorrow(BorrowEntity borrowEntity);
	
	/**
 	 * 方法描述:  转让申请
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject borrowTransfer(BorrowTransferEntity borrowTransferEntity);
	
	/**
 	 * 方法描述:  借款申请
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject borrowApply(BorrowEntity borrowEntity);
	
	/**
 	 * 方法描述:  流标
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject borrowFlow(BorrowEntity borrowEntity);
	
	/**
 	 * 方法描述:  借款/转让标的发布
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowTransferEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject borrowTransferRelease(BorrowTransferEntity borrowTransferEntity);
	
	
	/**
 	 * 方法描述:  罚息更新
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject updateLateInterest(BorrowRepaymentEntity borrowRepaymentEntity);
	
	
	/**
 	 * 方法描述:  新手标投资
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject newbigTender(BorrowTenderEntity bTenderEntity);
	
	
	/**
 	 * 方法描述：新手标还款
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param BorrowEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject updateRequest(BorrowEntity borrowEntity);
	
	
	/**
 	 * 方法描述：截标
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param updateBorrowMoney 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject updateBorrowMoney(BorrowEntity borrowEntity);
	
	
	
	
	
	/**
 	 * 方法描述：还款给平台
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param updateBorrowMoney 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject updateLateOnLineRepayment(BorrowEntity borrowEntity);
	
	
	/**
 	 * 方法描述：转让计算
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param updateBorrowMoney 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject getTransferPrice(BorrowEntity borrowEntity);
	
	
	/**
 	 * 方法描述：合同生成
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param updateBorrowMoney 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject getTransferPrice(ContractEntity contractEntity);
	
	
	/**
 	 * 方法描述：未处理合同生成
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param updateBorrowMoney 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject untreatedTenderContract(ContractEntity contractEntity);
	
	
	/**
 	 * 方法描述：生成应收账款转让及回购协议合同 
 	 * 作    者： dinnis
 	 * 日    期： 2016年2月11日-下午9:22:42
 	 * @param updateBorrowMoney 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public JSONObject saveFullBidContract(ContractEntity contractEntity);
	 
	
	
}