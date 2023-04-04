/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link smallwork}.
 * </p>
 *
 * @author dell
 * @see smallwork
 * @generated
 */
public class smallworkWrapper implements smallwork, ModelWrapper<smallwork> {
	public smallworkWrapper(smallwork smallwork) {
		_smallwork = smallwork;
	}

	@Override
	public Class<?> getModelClass() {
		return smallwork.class;
	}

	@Override
	public String getModelClassName() {
		return smallwork.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("quoteReference", getQuoteReference());
		attributes.put("projectName", getProjectName());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("workType", getWorkType());
		attributes.put("leadSource", getLeadSource());
		attributes.put("productSpecific", getProductSpecific());
		attributes.put("description", getDescription());
		attributes.put("customerName", getCustomerName());
		attributes.put("postcode", getPostcode());
		attributes.put("sitename", getSitename());
		attributes.put("lead", getLead());
		attributes.put("location", getLocation());
		attributes.put("enduser", getEnduser());
		attributes.put("contactName", getContactName());
		attributes.put("phone", getPhone());
		attributes.put("email", getEmail());
		attributes.put("projectDate", getProjectDate());
		attributes.put("anticipatedDate", getAnticipatedDate());
		attributes.put("endDate", getEndDate());
		attributes.put("endDate2", getEndDate2());
		attributes.put("bidInfor", getBidInfor());
		attributes.put("quotationName", getQuotationName());
		attributes.put("projectCost", getProjectCost());
		attributes.put("dateShowOnQuote", getDateShowOnQuote());
		attributes.put("projectSell", getProjectSell());
		attributes.put("quoteSubmitDate", getQuoteSubmitDate());
		attributes.put("winProbability", getWinProbability());
		attributes.put("stage", getStage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String quoteReference = (String)attributes.get("quoteReference");

		if (quoteReference != null) {
			setQuoteReference(quoteReference);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		String workType = (String)attributes.get("workType");

		if (workType != null) {
			setWorkType(workType);
		}

		String leadSource = (String)attributes.get("leadSource");

		if (leadSource != null) {
			setLeadSource(leadSource);
		}

		String productSpecific = (String)attributes.get("productSpecific");

		if (productSpecific != null) {
			setProductSpecific(productSpecific);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String postcode = (String)attributes.get("postcode");

		if (postcode != null) {
			setPostcode(postcode);
		}

		String sitename = (String)attributes.get("sitename");

		if (sitename != null) {
			setSitename(sitename);
		}

		String lead = (String)attributes.get("lead");

		if (lead != null) {
			setLead(lead);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String enduser = (String)attributes.get("enduser");

		if (enduser != null) {
			setEnduser(enduser);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String projectDate = (String)attributes.get("projectDate");

		if (projectDate != null) {
			setProjectDate(projectDate);
		}

		String anticipatedDate = (String)attributes.get("anticipatedDate");

		if (anticipatedDate != null) {
			setAnticipatedDate(anticipatedDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String endDate2 = (String)attributes.get("endDate2");

		if (endDate2 != null) {
			setEndDate2(endDate2);
		}

		String bidInfor = (String)attributes.get("bidInfor");

		if (bidInfor != null) {
			setBidInfor(bidInfor);
		}

		String quotationName = (String)attributes.get("quotationName");

		if (quotationName != null) {
			setQuotationName(quotationName);
		}

		Integer projectCost = (Integer)attributes.get("projectCost");

		if (projectCost != null) {
			setProjectCost(projectCost);
		}

		String dateShowOnQuote = (String)attributes.get("dateShowOnQuote");

		if (dateShowOnQuote != null) {
			setDateShowOnQuote(dateShowOnQuote);
		}

		Integer projectSell = (Integer)attributes.get("projectSell");

		if (projectSell != null) {
			setProjectSell(projectSell);
		}

		String quoteSubmitDate = (String)attributes.get("quoteSubmitDate");

		if (quoteSubmitDate != null) {
			setQuoteSubmitDate(quoteSubmitDate);
		}

		String winProbability = (String)attributes.get("winProbability");

		if (winProbability != null) {
			setWinProbability(winProbability);
		}

		String stage = (String)attributes.get("stage");

		if (stage != null) {
			setStage(stage);
		}
	}

	/**
	* Returns the primary key of this smallwork.
	*
	* @return the primary key of this smallwork
	*/
	@Override
	public int getPrimaryKey() {
		return _smallwork.getPrimaryKey();
	}

	/**
	* Sets the primary key of this smallwork.
	*
	* @param primaryKey the primary key of this smallwork
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_smallwork.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this smallwork.
	*
	* @return the ID of this smallwork
	*/
	@Override
	public int getId() {
		return _smallwork.getId();
	}

	/**
	* Sets the ID of this smallwork.
	*
	* @param id the ID of this smallwork
	*/
	@Override
	public void setId(int id) {
		_smallwork.setId(id);
	}

	/**
	* Returns the quote reference of this smallwork.
	*
	* @return the quote reference of this smallwork
	*/
	@Override
	public java.lang.String getQuoteReference() {
		return _smallwork.getQuoteReference();
	}

	/**
	* Sets the quote reference of this smallwork.
	*
	* @param quoteReference the quote reference of this smallwork
	*/
	@Override
	public void setQuoteReference(java.lang.String quoteReference) {
		_smallwork.setQuoteReference(quoteReference);
	}

	/**
	* Returns the project name of this smallwork.
	*
	* @return the project name of this smallwork
	*/
	@Override
	public java.lang.String getProjectName() {
		return _smallwork.getProjectName();
	}

	/**
	* Sets the project name of this smallwork.
	*
	* @param projectName the project name of this smallwork
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_smallwork.setProjectName(projectName);
	}

	/**
	* Returns the customer address of this smallwork.
	*
	* @return the customer address of this smallwork
	*/
	@Override
	public java.lang.String getCustomerAddress() {
		return _smallwork.getCustomerAddress();
	}

	/**
	* Sets the customer address of this smallwork.
	*
	* @param customerAddress the customer address of this smallwork
	*/
	@Override
	public void setCustomerAddress(java.lang.String customerAddress) {
		_smallwork.setCustomerAddress(customerAddress);
	}

	/**
	* Returns the work type of this smallwork.
	*
	* @return the work type of this smallwork
	*/
	@Override
	public java.lang.String getWorkType() {
		return _smallwork.getWorkType();
	}

	/**
	* Sets the work type of this smallwork.
	*
	* @param workType the work type of this smallwork
	*/
	@Override
	public void setWorkType(java.lang.String workType) {
		_smallwork.setWorkType(workType);
	}

	/**
	* Returns the lead source of this smallwork.
	*
	* @return the lead source of this smallwork
	*/
	@Override
	public java.lang.String getLeadSource() {
		return _smallwork.getLeadSource();
	}

	/**
	* Sets the lead source of this smallwork.
	*
	* @param leadSource the lead source of this smallwork
	*/
	@Override
	public void setLeadSource(java.lang.String leadSource) {
		_smallwork.setLeadSource(leadSource);
	}

	/**
	* Returns the product specific of this smallwork.
	*
	* @return the product specific of this smallwork
	*/
	@Override
	public java.lang.String getProductSpecific() {
		return _smallwork.getProductSpecific();
	}

	/**
	* Sets the product specific of this smallwork.
	*
	* @param productSpecific the product specific of this smallwork
	*/
	@Override
	public void setProductSpecific(java.lang.String productSpecific) {
		_smallwork.setProductSpecific(productSpecific);
	}

	/**
	* Returns the description of this smallwork.
	*
	* @return the description of this smallwork
	*/
	@Override
	public java.lang.String getDescription() {
		return _smallwork.getDescription();
	}

	/**
	* Sets the description of this smallwork.
	*
	* @param description the description of this smallwork
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_smallwork.setDescription(description);
	}

	/**
	* Returns the customer name of this smallwork.
	*
	* @return the customer name of this smallwork
	*/
	@Override
	public java.lang.String getCustomerName() {
		return _smallwork.getCustomerName();
	}

	/**
	* Sets the customer name of this smallwork.
	*
	* @param customerName the customer name of this smallwork
	*/
	@Override
	public void setCustomerName(java.lang.String customerName) {
		_smallwork.setCustomerName(customerName);
	}

	/**
	* Returns the postcode of this smallwork.
	*
	* @return the postcode of this smallwork
	*/
	@Override
	public java.lang.String getPostcode() {
		return _smallwork.getPostcode();
	}

	/**
	* Sets the postcode of this smallwork.
	*
	* @param postcode the postcode of this smallwork
	*/
	@Override
	public void setPostcode(java.lang.String postcode) {
		_smallwork.setPostcode(postcode);
	}

	/**
	* Returns the sitename of this smallwork.
	*
	* @return the sitename of this smallwork
	*/
	@Override
	public java.lang.String getSitename() {
		return _smallwork.getSitename();
	}

	/**
	* Sets the sitename of this smallwork.
	*
	* @param sitename the sitename of this smallwork
	*/
	@Override
	public void setSitename(java.lang.String sitename) {
		_smallwork.setSitename(sitename);
	}

	/**
	* Returns the lead of this smallwork.
	*
	* @return the lead of this smallwork
	*/
	@Override
	public java.lang.String getLead() {
		return _smallwork.getLead();
	}

	/**
	* Sets the lead of this smallwork.
	*
	* @param lead the lead of this smallwork
	*/
	@Override
	public void setLead(java.lang.String lead) {
		_smallwork.setLead(lead);
	}

	/**
	* Returns the location of this smallwork.
	*
	* @return the location of this smallwork
	*/
	@Override
	public java.lang.String getLocation() {
		return _smallwork.getLocation();
	}

	/**
	* Sets the location of this smallwork.
	*
	* @param location the location of this smallwork
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_smallwork.setLocation(location);
	}

	/**
	* Returns the enduser of this smallwork.
	*
	* @return the enduser of this smallwork
	*/
	@Override
	public java.lang.String getEnduser() {
		return _smallwork.getEnduser();
	}

	/**
	* Sets the enduser of this smallwork.
	*
	* @param enduser the enduser of this smallwork
	*/
	@Override
	public void setEnduser(java.lang.String enduser) {
		_smallwork.setEnduser(enduser);
	}

	/**
	* Returns the contact name of this smallwork.
	*
	* @return the contact name of this smallwork
	*/
	@Override
	public java.lang.String getContactName() {
		return _smallwork.getContactName();
	}

	/**
	* Sets the contact name of this smallwork.
	*
	* @param contactName the contact name of this smallwork
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_smallwork.setContactName(contactName);
	}

	/**
	* Returns the phone of this smallwork.
	*
	* @return the phone of this smallwork
	*/
	@Override
	public java.lang.String getPhone() {
		return _smallwork.getPhone();
	}

	/**
	* Sets the phone of this smallwork.
	*
	* @param phone the phone of this smallwork
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_smallwork.setPhone(phone);
	}

	/**
	* Returns the email of this smallwork.
	*
	* @return the email of this smallwork
	*/
	@Override
	public java.lang.String getEmail() {
		return _smallwork.getEmail();
	}

	/**
	* Sets the email of this smallwork.
	*
	* @param email the email of this smallwork
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_smallwork.setEmail(email);
	}

	/**
	* Returns the project date of this smallwork.
	*
	* @return the project date of this smallwork
	*/
	@Override
	public java.lang.String getProjectDate() {
		return _smallwork.getProjectDate();
	}

	/**
	* Sets the project date of this smallwork.
	*
	* @param projectDate the project date of this smallwork
	*/
	@Override
	public void setProjectDate(java.lang.String projectDate) {
		_smallwork.setProjectDate(projectDate);
	}

	/**
	* Returns the anticipated date of this smallwork.
	*
	* @return the anticipated date of this smallwork
	*/
	@Override
	public java.lang.String getAnticipatedDate() {
		return _smallwork.getAnticipatedDate();
	}

	/**
	* Sets the anticipated date of this smallwork.
	*
	* @param anticipatedDate the anticipated date of this smallwork
	*/
	@Override
	public void setAnticipatedDate(java.lang.String anticipatedDate) {
		_smallwork.setAnticipatedDate(anticipatedDate);
	}

	/**
	* Returns the end date of this smallwork.
	*
	* @return the end date of this smallwork
	*/
	@Override
	public java.lang.String getEndDate() {
		return _smallwork.getEndDate();
	}

	/**
	* Sets the end date of this smallwork.
	*
	* @param endDate the end date of this smallwork
	*/
	@Override
	public void setEndDate(java.lang.String endDate) {
		_smallwork.setEndDate(endDate);
	}

	/**
	* Returns the end date2 of this smallwork.
	*
	* @return the end date2 of this smallwork
	*/
	@Override
	public java.lang.String getEndDate2() {
		return _smallwork.getEndDate2();
	}

	/**
	* Sets the end date2 of this smallwork.
	*
	* @param endDate2 the end date2 of this smallwork
	*/
	@Override
	public void setEndDate2(java.lang.String endDate2) {
		_smallwork.setEndDate2(endDate2);
	}

	/**
	* Returns the bid infor of this smallwork.
	*
	* @return the bid infor of this smallwork
	*/
	@Override
	public java.lang.String getBidInfor() {
		return _smallwork.getBidInfor();
	}

	/**
	* Sets the bid infor of this smallwork.
	*
	* @param bidInfor the bid infor of this smallwork
	*/
	@Override
	public void setBidInfor(java.lang.String bidInfor) {
		_smallwork.setBidInfor(bidInfor);
	}

	/**
	* Returns the quotation name of this smallwork.
	*
	* @return the quotation name of this smallwork
	*/
	@Override
	public java.lang.String getQuotationName() {
		return _smallwork.getQuotationName();
	}

	/**
	* Sets the quotation name of this smallwork.
	*
	* @param quotationName the quotation name of this smallwork
	*/
	@Override
	public void setQuotationName(java.lang.String quotationName) {
		_smallwork.setQuotationName(quotationName);
	}

	/**
	* Returns the project cost of this smallwork.
	*
	* @return the project cost of this smallwork
	*/
	@Override
	public int getProjectCost() {
		return _smallwork.getProjectCost();
	}

	/**
	* Sets the project cost of this smallwork.
	*
	* @param projectCost the project cost of this smallwork
	*/
	@Override
	public void setProjectCost(int projectCost) {
		_smallwork.setProjectCost(projectCost);
	}

	/**
	* Returns the date show on quote of this smallwork.
	*
	* @return the date show on quote of this smallwork
	*/
	@Override
	public java.lang.String getDateShowOnQuote() {
		return _smallwork.getDateShowOnQuote();
	}

	/**
	* Sets the date show on quote of this smallwork.
	*
	* @param dateShowOnQuote the date show on quote of this smallwork
	*/
	@Override
	public void setDateShowOnQuote(java.lang.String dateShowOnQuote) {
		_smallwork.setDateShowOnQuote(dateShowOnQuote);
	}

	/**
	* Returns the project sell of this smallwork.
	*
	* @return the project sell of this smallwork
	*/
	@Override
	public int getProjectSell() {
		return _smallwork.getProjectSell();
	}

	/**
	* Sets the project sell of this smallwork.
	*
	* @param projectSell the project sell of this smallwork
	*/
	@Override
	public void setProjectSell(int projectSell) {
		_smallwork.setProjectSell(projectSell);
	}

	/**
	* Returns the quote submit date of this smallwork.
	*
	* @return the quote submit date of this smallwork
	*/
	@Override
	public java.lang.String getQuoteSubmitDate() {
		return _smallwork.getQuoteSubmitDate();
	}

	/**
	* Sets the quote submit date of this smallwork.
	*
	* @param quoteSubmitDate the quote submit date of this smallwork
	*/
	@Override
	public void setQuoteSubmitDate(java.lang.String quoteSubmitDate) {
		_smallwork.setQuoteSubmitDate(quoteSubmitDate);
	}

	/**
	* Returns the win probability of this smallwork.
	*
	* @return the win probability of this smallwork
	*/
	@Override
	public java.lang.String getWinProbability() {
		return _smallwork.getWinProbability();
	}

	/**
	* Sets the win probability of this smallwork.
	*
	* @param winProbability the win probability of this smallwork
	*/
	@Override
	public void setWinProbability(java.lang.String winProbability) {
		_smallwork.setWinProbability(winProbability);
	}

	/**
	* Returns the stage of this smallwork.
	*
	* @return the stage of this smallwork
	*/
	@Override
	public java.lang.String getStage() {
		return _smallwork.getStage();
	}

	/**
	* Sets the stage of this smallwork.
	*
	* @param stage the stage of this smallwork
	*/
	@Override
	public void setStage(java.lang.String stage) {
		_smallwork.setStage(stage);
	}

	@Override
	public boolean isNew() {
		return _smallwork.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_smallwork.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _smallwork.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_smallwork.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _smallwork.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _smallwork.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_smallwork.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _smallwork.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_smallwork.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_smallwork.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_smallwork.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new smallworkWrapper((smallwork)_smallwork.clone());
	}

	@Override
	public int compareTo(com.test.model.smallwork smallwork) {
		return _smallwork.compareTo(smallwork);
	}

	@Override
	public int hashCode() {
		return _smallwork.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.smallwork> toCacheModel() {
		return _smallwork.toCacheModel();
	}

	@Override
	public com.test.model.smallwork toEscapedModel() {
		return new smallworkWrapper(_smallwork.toEscapedModel());
	}

	@Override
	public com.test.model.smallwork toUnescapedModel() {
		return new smallworkWrapper(_smallwork.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _smallwork.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _smallwork.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_smallwork.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof smallworkWrapper)) {
			return false;
		}

		smallworkWrapper smallworkWrapper = (smallworkWrapper)obj;

		if (Validator.equals(_smallwork, smallworkWrapper._smallwork)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public smallwork getWrappedsmallwork() {
		return _smallwork;
	}

	@Override
	public smallwork getWrappedModel() {
		return _smallwork;
	}

	@Override
	public void resetOriginalValues() {
		_smallwork.resetOriginalValues();
	}

	private smallwork _smallwork;
}