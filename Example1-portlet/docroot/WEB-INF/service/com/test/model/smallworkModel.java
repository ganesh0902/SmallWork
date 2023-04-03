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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the smallwork service. Represents a row in the &quot;smallwork&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.model.impl.smallworkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.model.impl.smallworkImpl}.
 * </p>
 *
 * @author dell
 * @see smallwork
 * @see com.test.model.impl.smallworkImpl
 * @see com.test.model.impl.smallworkModelImpl
 * @generated
 */
public interface smallworkModel extends BaseModel<smallwork> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a smallwork model instance should use the {@link smallwork} interface instead.
	 */

	/**
	 * Returns the primary key of this smallwork.
	 *
	 * @return the primary key of this smallwork
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this smallwork.
	 *
	 * @param primaryKey the primary key of this smallwork
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this smallwork.
	 *
	 * @return the ID of this smallwork
	 */
	public int getId();

	/**
	 * Sets the ID of this smallwork.
	 *
	 * @param id the ID of this smallwork
	 */
	public void setId(int id);

	/**
	 * Returns the quote reference of this smallwork.
	 *
	 * @return the quote reference of this smallwork
	 */
	@AutoEscape
	public String getQuoteReference();

	/**
	 * Sets the quote reference of this smallwork.
	 *
	 * @param quoteReference the quote reference of this smallwork
	 */
	public void setQuoteReference(String quoteReference);

	/**
	 * Returns the project name of this smallwork.
	 *
	 * @return the project name of this smallwork
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this smallwork.
	 *
	 * @param projectName the project name of this smallwork
	 */
	public void setProjectName(String projectName);

	/**
	 * Returns the customer address of this smallwork.
	 *
	 * @return the customer address of this smallwork
	 */
	@AutoEscape
	public String getCustomerAddress();

	/**
	 * Sets the customer address of this smallwork.
	 *
	 * @param customerAddress the customer address of this smallwork
	 */
	public void setCustomerAddress(String customerAddress);

	/**
	 * Returns the work type of this smallwork.
	 *
	 * @return the work type of this smallwork
	 */
	@AutoEscape
	public String getWorkType();

	/**
	 * Sets the work type of this smallwork.
	 *
	 * @param workType the work type of this smallwork
	 */
	public void setWorkType(String workType);

	/**
	 * Returns the lead source of this smallwork.
	 *
	 * @return the lead source of this smallwork
	 */
	@AutoEscape
	public String getLeadSource();

	/**
	 * Sets the lead source of this smallwork.
	 *
	 * @param leadSource the lead source of this smallwork
	 */
	public void setLeadSource(String leadSource);

	/**
	 * Returns the product specific of this smallwork.
	 *
	 * @return the product specific of this smallwork
	 */
	@AutoEscape
	public String getProductSpecific();

	/**
	 * Sets the product specific of this smallwork.
	 *
	 * @param productSpecific the product specific of this smallwork
	 */
	public void setProductSpecific(String productSpecific);

	/**
	 * Returns the description of this smallwork.
	 *
	 * @return the description of this smallwork
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this smallwork.
	 *
	 * @param description the description of this smallwork
	 */
	public void setDescription(String description);

	/**
	 * Returns the customer name of this smallwork.
	 *
	 * @return the customer name of this smallwork
	 */
	@AutoEscape
	public String getCustomerName();

	/**
	 * Sets the customer name of this smallwork.
	 *
	 * @param customerName the customer name of this smallwork
	 */
	public void setCustomerName(String customerName);

	/**
	 * Returns the postcode of this smallwork.
	 *
	 * @return the postcode of this smallwork
	 */
	@AutoEscape
	public String getPostcode();

	/**
	 * Sets the postcode of this smallwork.
	 *
	 * @param postcode the postcode of this smallwork
	 */
	public void setPostcode(String postcode);

	/**
	 * Returns the sitename of this smallwork.
	 *
	 * @return the sitename of this smallwork
	 */
	@AutoEscape
	public String getSitename();

	/**
	 * Sets the sitename of this smallwork.
	 *
	 * @param sitename the sitename of this smallwork
	 */
	public void setSitename(String sitename);

	/**
	 * Returns the lead of this smallwork.
	 *
	 * @return the lead of this smallwork
	 */
	@AutoEscape
	public String getLead();

	/**
	 * Sets the lead of this smallwork.
	 *
	 * @param lead the lead of this smallwork
	 */
	public void setLead(String lead);

	/**
	 * Returns the location of this smallwork.
	 *
	 * @return the location of this smallwork
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this smallwork.
	 *
	 * @param location the location of this smallwork
	 */
	public void setLocation(String location);

	/**
	 * Returns the enduser of this smallwork.
	 *
	 * @return the enduser of this smallwork
	 */
	@AutoEscape
	public String getEnduser();

	/**
	 * Sets the enduser of this smallwork.
	 *
	 * @param enduser the enduser of this smallwork
	 */
	public void setEnduser(String enduser);

	/**
	 * Returns the contact name of this smallwork.
	 *
	 * @return the contact name of this smallwork
	 */
	@AutoEscape
	public String getContactName();

	/**
	 * Sets the contact name of this smallwork.
	 *
	 * @param contactName the contact name of this smallwork
	 */
	public void setContactName(String contactName);

	/**
	 * Returns the phone of this smallwork.
	 *
	 * @return the phone of this smallwork
	 */
	public int getPhone();

	/**
	 * Sets the phone of this smallwork.
	 *
	 * @param phone the phone of this smallwork
	 */
	public void setPhone(int phone);

	/**
	 * Returns the email of this smallwork.
	 *
	 * @return the email of this smallwork
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this smallwork.
	 *
	 * @param email the email of this smallwork
	 */
	public void setEmail(String email);

	/**
	 * Returns the project date of this smallwork.
	 *
	 * @return the project date of this smallwork
	 */
	@AutoEscape
	public String getProjectDate();

	/**
	 * Sets the project date of this smallwork.
	 *
	 * @param projectDate the project date of this smallwork
	 */
	public void setProjectDate(String projectDate);

	/**
	 * Returns the anticipated date of this smallwork.
	 *
	 * @return the anticipated date of this smallwork
	 */
	@AutoEscape
	public String getAnticipatedDate();

	/**
	 * Sets the anticipated date of this smallwork.
	 *
	 * @param anticipatedDate the anticipated date of this smallwork
	 */
	public void setAnticipatedDate(String anticipatedDate);

	/**
	 * Returns the end date of this smallwork.
	 *
	 * @return the end date of this smallwork
	 */
	@AutoEscape
	public String getEndDate();

	/**
	 * Sets the end date of this smallwork.
	 *
	 * @param endDate the end date of this smallwork
	 */
	public void setEndDate(String endDate);

	/**
	 * Returns the end date2 of this smallwork.
	 *
	 * @return the end date2 of this smallwork
	 */
	@AutoEscape
	public String getEndDate2();

	/**
	 * Sets the end date2 of this smallwork.
	 *
	 * @param endDate2 the end date2 of this smallwork
	 */
	public void setEndDate2(String endDate2);

	/**
	 * Returns the bid infor of this smallwork.
	 *
	 * @return the bid infor of this smallwork
	 */
	@AutoEscape
	public String getBidInfor();

	/**
	 * Sets the bid infor of this smallwork.
	 *
	 * @param bidInfor the bid infor of this smallwork
	 */
	public void setBidInfor(String bidInfor);

	/**
	 * Returns the quotation name of this smallwork.
	 *
	 * @return the quotation name of this smallwork
	 */
	@AutoEscape
	public String getQuotationName();

	/**
	 * Sets the quotation name of this smallwork.
	 *
	 * @param quotationName the quotation name of this smallwork
	 */
	public void setQuotationName(String quotationName);

	/**
	 * Returns the project cost of this smallwork.
	 *
	 * @return the project cost of this smallwork
	 */
	public int getProjectCost();

	/**
	 * Sets the project cost of this smallwork.
	 *
	 * @param projectCost the project cost of this smallwork
	 */
	public void setProjectCost(int projectCost);

	/**
	 * Returns the date show on quote of this smallwork.
	 *
	 * @return the date show on quote of this smallwork
	 */
	@AutoEscape
	public String getDateShowOnQuote();

	/**
	 * Sets the date show on quote of this smallwork.
	 *
	 * @param dateShowOnQuote the date show on quote of this smallwork
	 */
	public void setDateShowOnQuote(String dateShowOnQuote);

	/**
	 * Returns the project sell of this smallwork.
	 *
	 * @return the project sell of this smallwork
	 */
	public int getProjectSell();

	/**
	 * Sets the project sell of this smallwork.
	 *
	 * @param projectSell the project sell of this smallwork
	 */
	public void setProjectSell(int projectSell);

	/**
	 * Returns the quote submit date of this smallwork.
	 *
	 * @return the quote submit date of this smallwork
	 */
	@AutoEscape
	public String getQuoteSubmitDate();

	/**
	 * Sets the quote submit date of this smallwork.
	 *
	 * @param quoteSubmitDate the quote submit date of this smallwork
	 */
	public void setQuoteSubmitDate(String quoteSubmitDate);

	/**
	 * Returns the win probability of this smallwork.
	 *
	 * @return the win probability of this smallwork
	 */
	@AutoEscape
	public String getWinProbability();

	/**
	 * Sets the win probability of this smallwork.
	 *
	 * @param winProbability the win probability of this smallwork
	 */
	public void setWinProbability(String winProbability);

	/**
	 * Returns the stage of this smallwork.
	 *
	 * @return the stage of this smallwork
	 */
	@AutoEscape
	public String getStage();

	/**
	 * Sets the stage of this smallwork.
	 *
	 * @param stage the stage of this smallwork
	 */
	public void setStage(String stage);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.test.model.smallwork smallwork);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.test.model.smallwork> toCacheModel();

	@Override
	public com.test.model.smallwork toEscapedModel();

	@Override
	public com.test.model.smallwork toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}