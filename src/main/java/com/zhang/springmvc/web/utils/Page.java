package com.zhang.springmvc.web.utils;

import java.util.List;

@SuppressWarnings("rawtypes")
public class Page {

	private long total;
	private int start;
	private int limit;
	private List datas;

	public Page() {
	}

	public Page(long total) {
		super();
		this.total = total;
	}

	public Page(long total, List datas) {
		super();
		this.total = total;
		this.datas = datas;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public List getDatas() {
		return datas;
	}

	public void setDatas(List datas) {
		this.datas = datas;
	}

}
