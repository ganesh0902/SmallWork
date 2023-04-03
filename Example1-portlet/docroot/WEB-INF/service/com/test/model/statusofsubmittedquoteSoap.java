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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.service.http.statusofsubmittedquoteServiceSoap}.
 *
 * @author dell
 * @see com.test.service.http.statusofsubmittedquoteServiceSoap
 * @generated
 */
public class statusofsubmittedquoteSoap implements Serializable {
	public static statusofsubmittedquoteSoap toSoapModel(
		statusofsubmittedquote model) {
		statusofsubmittedquoteSoap soapModel = new statusofsubmittedquoteSoap();

		soapModel.setSosqId(model.getSosqId());
		soapModel.setSosq(model.getSosq());
		soapModel.setWinprob(model.getWinprob());
		soapModel.setAorderdate(model.getAorderdate());
		soapModel.setPpstartdate(model.getPpstartdate());
		soapModel.setPpenddate(model.getPpenddate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCustomercomittype(model.getCustomercomittype());
		soapModel.setUpload(model.getUpload());
		soapModel.setPon(model.getPon());
		soapModel.setValueofcommit(model.getValueofcommit());
		soapModel.setRmethod(model.getRmethod());
		soapModel.setRdate(model.getRdate());
		soapModel.setPcdc(model.getPcdc());
		soapModel.setOnwhatbasis(model.getOnwhatbasis());
		soapModel.setRecordproposedcourse(model.getRecordproposedcourse());
		soapModel.setComments(model.getComments());
		soapModel.setCurrrentId(model.getCurrrentId());

		return soapModel;
	}

	public static statusofsubmittedquoteSoap[] toSoapModels(
		statusofsubmittedquote[] models) {
		statusofsubmittedquoteSoap[] soapModels = new statusofsubmittedquoteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static statusofsubmittedquoteSoap[][] toSoapModels(
		statusofsubmittedquote[][] models) {
		statusofsubmittedquoteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new statusofsubmittedquoteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new statusofsubmittedquoteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static statusofsubmittedquoteSoap[] toSoapModels(
		List<statusofsubmittedquote> models) {
		List<statusofsubmittedquoteSoap> soapModels = new ArrayList<statusofsubmittedquoteSoap>(models.size());

		for (statusofsubmittedquote model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new statusofsubmittedquoteSoap[soapModels.size()]);
	}

	public statusofsubmittedquoteSoap() {
	}

	public long getPrimaryKey() {
		return _sosqId;
	}

	public void setPrimaryKey(long pk) {
		setSosqId(pk);
	}

	public long getSosqId() {
		return _sosqId;
	}

	public void setSosqId(long sosqId) {
		_sosqId = sosqId;
	}

	public String getSosq() {
		return _sosq;
	}

	public void setSosq(String sosq) {
		_sosq = sosq;
	}

	public String getWinprob() {
		return _winprob;
	}

	public void setWinprob(String winprob) {
		_winprob = winprob;
	}

	public String getAorderdate() {
		return _aorderdate;
	}

	public void setAorderdate(String aorderdate) {
		_aorderdate = aorderdate;
	}

	public String getPpstartdate() {
		return _ppstartdate;
	}

	public void setPpstartdate(String ppstartdate) {
		_ppstartdate = ppstartdate;
	}

	public String getPpenddate() {
		return _ppenddate;
	}

	public void setPpenddate(String ppenddate) {
		_ppenddate = ppenddate;
	}

	public String getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(String createDate) {
		_createDate = createDate;
	}

	public String getCustomercomittype() {
		return _customercomittype;
	}

	public void setCustomercomittype(String customercomittype) {
		_customercomittype = customercomittype;
	}

	public String getUpload() {
		return _upload;
	}

	public void setUpload(String upload) {
		_upload = upload;
	}

	public long getPon() {
		return _pon;
	}

	public void setPon(long pon) {
		_pon = pon;
	}

	public long getValueofcommit() {
		return _valueofcommit;
	}

	public void setValueofcommit(long valueofcommit) {
		_valueofcommit = valueofcommit;
	}

	public String getRmethod() {
		return _rmethod;
	}

	public void setRmethod(String rmethod) {
		_rmethod = rmethod;
	}

	public String getRdate() {
		return _rdate;
	}

	public void setRdate(String rdate) {
		_rdate = rdate;
	}

	public String getPcdc() {
		return _pcdc;
	}

	public void setPcdc(String pcdc) {
		_pcdc = pcdc;
	}

	public String getOnwhatbasis() {
		return _onwhatbasis;
	}

	public void setOnwhatbasis(String onwhatbasis) {
		_onwhatbasis = onwhatbasis;
	}

	public String getRecordproposedcourse() {
		return _recordproposedcourse;
	}

	public void setRecordproposedcourse(String recordproposedcourse) {
		_recordproposedcourse = recordproposedcourse;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public Integer getCurrrentId() {
		return _currrentId;
	}

	public void setCurrrentId(Integer currrentId) {
		_currrentId = currrentId;
	}

	private long _sosqId;
	private String _sosq;
	private String _winprob;
	private String _aorderdate;
	private String _ppstartdate;
	private String _ppenddate;
	private String _createDate;
	private String _customercomittype;
	private String _upload;
	private long _pon;
	private long _valueofcommit;
	private String _rmethod;
	private String _rdate;
	private String _pcdc;
	private String _onwhatbasis;
	private String _recordproposedcourse;
	private String _comments;
	private Integer _currrentId;
}