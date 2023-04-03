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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.ClpSerializer;
import com.test.service.statusofsubmittedquoteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dell
 */
public class statusofsubmittedquoteClp extends BaseModelImpl<statusofsubmittedquote>
	implements statusofsubmittedquote {
	public statusofsubmittedquoteClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return statusofsubmittedquote.class;
	}

	@Override
	public String getModelClassName() {
		return statusofsubmittedquote.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _sosqId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSosqId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sosqId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sosqId", getSosqId());
		attributes.put("sosq", getSosq());
		attributes.put("winprob", getWinprob());
		attributes.put("aorderdate", getAorderdate());
		attributes.put("ppstartdate", getPpstartdate());
		attributes.put("ppenddate", getPpenddate());
		attributes.put("createDate", getCreateDate());
		attributes.put("customercomittype", getCustomercomittype());
		attributes.put("upload", getUpload());
		attributes.put("pon", getPon());
		attributes.put("valueofcommit", getValueofcommit());
		attributes.put("rmethod", getRmethod());
		attributes.put("rdate", getRdate());
		attributes.put("pcdc", getPcdc());
		attributes.put("onwhatbasis", getOnwhatbasis());
		attributes.put("recordproposedcourse", getRecordproposedcourse());
		attributes.put("comments", getComments());
		attributes.put("currrentId", getCurrrentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sosqId = (Long)attributes.get("sosqId");

		if (sosqId != null) {
			setSosqId(sosqId);
		}

		String sosq = (String)attributes.get("sosq");

		if (sosq != null) {
			setSosq(sosq);
		}

		String winprob = (String)attributes.get("winprob");

		if (winprob != null) {
			setWinprob(winprob);
		}

		String aorderdate = (String)attributes.get("aorderdate");

		if (aorderdate != null) {
			setAorderdate(aorderdate);
		}

		String ppstartdate = (String)attributes.get("ppstartdate");

		if (ppstartdate != null) {
			setPpstartdate(ppstartdate);
		}

		String ppenddate = (String)attributes.get("ppenddate");

		if (ppenddate != null) {
			setPpenddate(ppenddate);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String customercomittype = (String)attributes.get("customercomittype");

		if (customercomittype != null) {
			setCustomercomittype(customercomittype);
		}

		String upload = (String)attributes.get("upload");

		if (upload != null) {
			setUpload(upload);
		}

		Long pon = (Long)attributes.get("pon");

		if (pon != null) {
			setPon(pon);
		}

		Long valueofcommit = (Long)attributes.get("valueofcommit");

		if (valueofcommit != null) {
			setValueofcommit(valueofcommit);
		}

		String rmethod = (String)attributes.get("rmethod");

		if (rmethod != null) {
			setRmethod(rmethod);
		}

		String rdate = (String)attributes.get("rdate");

		if (rdate != null) {
			setRdate(rdate);
		}

		String pcdc = (String)attributes.get("pcdc");

		if (pcdc != null) {
			setPcdc(pcdc);
		}

		String onwhatbasis = (String)attributes.get("onwhatbasis");

		if (onwhatbasis != null) {
			setOnwhatbasis(onwhatbasis);
		}

		String recordproposedcourse = (String)attributes.get(
				"recordproposedcourse");

		if (recordproposedcourse != null) {
			setRecordproposedcourse(recordproposedcourse);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		Integer currrentId = (Integer)attributes.get("currrentId");

		if (currrentId != null) {
			setCurrrentId(currrentId);
		}
	}

	@Override
	public long getSosqId() {
		return _sosqId;
	}

	@Override
	public void setSosqId(long sosqId) {
		_sosqId = sosqId;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setSosqId", long.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, sosqId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSosq() {
		return _sosq;
	}

	@Override
	public void setSosq(String sosq) {
		_sosq = sosq;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setSosq", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, sosq);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWinprob() {
		return _winprob;
	}

	@Override
	public void setWinprob(String winprob) {
		_winprob = winprob;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setWinprob", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, winprob);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAorderdate() {
		return _aorderdate;
	}

	@Override
	public void setAorderdate(String aorderdate) {
		_aorderdate = aorderdate;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setAorderdate", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, aorderdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPpstartdate() {
		return _ppstartdate;
	}

	@Override
	public void setPpstartdate(String ppstartdate) {
		_ppstartdate = ppstartdate;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setPpstartdate", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, ppstartdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPpenddate() {
		return _ppenddate;
	}

	@Override
	public void setPpenddate(String ppenddate) {
		_ppenddate = ppenddate;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setPpenddate", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, ppenddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(String createDate) {
		_createDate = createDate;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomercomittype() {
		return _customercomittype;
	}

	@Override
	public void setCustomercomittype(String customercomittype) {
		_customercomittype = customercomittype;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomercomittype",
						String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel,
					customercomittype);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUpload() {
		return _upload;
	}

	@Override
	public void setUpload(String upload) {
		_upload = upload;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setUpload", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, upload);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPon() {
		return _pon;
	}

	@Override
	public void setPon(long pon) {
		_pon = pon;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setPon", long.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, pon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getValueofcommit() {
		return _valueofcommit;
	}

	@Override
	public void setValueofcommit(long valueofcommit) {
		_valueofcommit = valueofcommit;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setValueofcommit", long.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, valueofcommit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRmethod() {
		return _rmethod;
	}

	@Override
	public void setRmethod(String rmethod) {
		_rmethod = rmethod;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setRmethod", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, rmethod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRdate() {
		return _rdate;
	}

	@Override
	public void setRdate(String rdate) {
		_rdate = rdate;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setRdate", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, rdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPcdc() {
		return _pcdc;
	}

	@Override
	public void setPcdc(String pcdc) {
		_pcdc = pcdc;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setPcdc", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, pcdc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOnwhatbasis() {
		return _onwhatbasis;
	}

	@Override
	public void setOnwhatbasis(String onwhatbasis) {
		_onwhatbasis = onwhatbasis;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setOnwhatbasis", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, onwhatbasis);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRecordproposedcourse() {
		return _recordproposedcourse;
	}

	@Override
	public void setRecordproposedcourse(String recordproposedcourse) {
		_recordproposedcourse = recordproposedcourse;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setRecordproposedcourse",
						String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel,
					recordproposedcourse);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComments() {
		return _comments;
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, comments);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Integer getCurrrentId() {
		return _currrentId;
	}

	@Override
	public void setCurrrentId(Integer currrentId) {
		_currrentId = currrentId;

		if (_statusofsubmittedquoteRemoteModel != null) {
			try {
				Class<?> clazz = _statusofsubmittedquoteRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrrentId", Integer.class);

				method.invoke(_statusofsubmittedquoteRemoteModel, currrentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getstatusofsubmittedquoteRemoteModel() {
		return _statusofsubmittedquoteRemoteModel;
	}

	public void setstatusofsubmittedquoteRemoteModel(
		BaseModel<?> statusofsubmittedquoteRemoteModel) {
		_statusofsubmittedquoteRemoteModel = statusofsubmittedquoteRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _statusofsubmittedquoteRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_statusofsubmittedquoteRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			statusofsubmittedquoteLocalServiceUtil.addstatusofsubmittedquote(this);
		}
		else {
			statusofsubmittedquoteLocalServiceUtil.updatestatusofsubmittedquote(this);
		}
	}

	@Override
	public statusofsubmittedquote toEscapedModel() {
		return (statusofsubmittedquote)ProxyUtil.newProxyInstance(statusofsubmittedquote.class.getClassLoader(),
			new Class[] { statusofsubmittedquote.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		statusofsubmittedquoteClp clone = new statusofsubmittedquoteClp();

		clone.setSosqId(getSosqId());
		clone.setSosq(getSosq());
		clone.setWinprob(getWinprob());
		clone.setAorderdate(getAorderdate());
		clone.setPpstartdate(getPpstartdate());
		clone.setPpenddate(getPpenddate());
		clone.setCreateDate(getCreateDate());
		clone.setCustomercomittype(getCustomercomittype());
		clone.setUpload(getUpload());
		clone.setPon(getPon());
		clone.setValueofcommit(getValueofcommit());
		clone.setRmethod(getRmethod());
		clone.setRdate(getRdate());
		clone.setPcdc(getPcdc());
		clone.setOnwhatbasis(getOnwhatbasis());
		clone.setRecordproposedcourse(getRecordproposedcourse());
		clone.setComments(getComments());
		clone.setCurrrentId(getCurrrentId());

		return clone;
	}

	@Override
	public int compareTo(statusofsubmittedquote statusofsubmittedquote) {
		long primaryKey = statusofsubmittedquote.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof statusofsubmittedquoteClp)) {
			return false;
		}

		statusofsubmittedquoteClp statusofsubmittedquote = (statusofsubmittedquoteClp)obj;

		long primaryKey = statusofsubmittedquote.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{sosqId=");
		sb.append(getSosqId());
		sb.append(", sosq=");
		sb.append(getSosq());
		sb.append(", winprob=");
		sb.append(getWinprob());
		sb.append(", aorderdate=");
		sb.append(getAorderdate());
		sb.append(", ppstartdate=");
		sb.append(getPpstartdate());
		sb.append(", ppenddate=");
		sb.append(getPpenddate());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", customercomittype=");
		sb.append(getCustomercomittype());
		sb.append(", upload=");
		sb.append(getUpload());
		sb.append(", pon=");
		sb.append(getPon());
		sb.append(", valueofcommit=");
		sb.append(getValueofcommit());
		sb.append(", rmethod=");
		sb.append(getRmethod());
		sb.append(", rdate=");
		sb.append(getRdate());
		sb.append(", pcdc=");
		sb.append(getPcdc());
		sb.append(", onwhatbasis=");
		sb.append(getOnwhatbasis());
		sb.append(", recordproposedcourse=");
		sb.append(getRecordproposedcourse());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", currrentId=");
		sb.append(getCurrrentId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.test.model.statusofsubmittedquote");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sosqId</column-name><column-value><![CDATA[");
		sb.append(getSosqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sosq</column-name><column-value><![CDATA[");
		sb.append(getSosq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>winprob</column-name><column-value><![CDATA[");
		sb.append(getWinprob());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>aorderdate</column-name><column-value><![CDATA[");
		sb.append(getAorderdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppstartdate</column-name><column-value><![CDATA[");
		sb.append(getPpstartdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ppenddate</column-name><column-value><![CDATA[");
		sb.append(getPpenddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customercomittype</column-name><column-value><![CDATA[");
		sb.append(getCustomercomittype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upload</column-name><column-value><![CDATA[");
		sb.append(getUpload());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pon</column-name><column-value><![CDATA[");
		sb.append(getPon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valueofcommit</column-name><column-value><![CDATA[");
		sb.append(getValueofcommit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rmethod</column-name><column-value><![CDATA[");
		sb.append(getRmethod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rdate</column-name><column-value><![CDATA[");
		sb.append(getRdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pcdc</column-name><column-value><![CDATA[");
		sb.append(getPcdc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>onwhatbasis</column-name><column-value><![CDATA[");
		sb.append(getOnwhatbasis());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recordproposedcourse</column-name><column-value><![CDATA[");
		sb.append(getRecordproposedcourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currrentId</column-name><column-value><![CDATA[");
		sb.append(getCurrrentId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _statusofsubmittedquoteRemoteModel;
	private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;
}