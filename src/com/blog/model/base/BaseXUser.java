package com.blog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseXUser<M extends BaseXUser<M>> extends Model<M> implements IBean {

	public M setXId(java.lang.Integer xId) {
		set("x_id", xId);
		return (M)this;
	}

	public java.lang.Integer getXId() {
		return getInt("x_id");
	}

	public M setXAccountnumber(java.lang.String xAccountnumber) {
		set("x_accountNumber", xAccountnumber);
		return (M)this;
	}

	public java.lang.String getXAccountnumber() {
		return getStr("x_accountNumber");
	}

	public M setXUsername(java.lang.String xUsername) {
		set("x_userName", xUsername);
		return (M)this;
	}

	public java.lang.String getXUsername() {
		return getStr("x_userName");
	}

	public M setXUserpass(java.lang.String xUserpass) {
		set("x_userPass", xUserpass);
		return (M)this;
	}

	public java.lang.String getXUserpass() {
		return getStr("x_userPass");
	}

	public M setXStatus(java.lang.String xStatus) {
		set("x_status", xStatus);
		return (M)this;
	}

	public java.lang.String getXStatus() {
		return getStr("x_status");
	}

}
