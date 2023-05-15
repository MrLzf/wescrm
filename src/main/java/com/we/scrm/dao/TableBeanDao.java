package com.we.scrm.dao;

import java.util.List;

import com.we.scrm.common.t2b.TableBean;
import org.apache.ibatis.annotations.Param;

public interface TableBeanDao {
	public String getCurrentTimestamp();
	public List<String> listTables(@Param("vo") TableBean vo);
	public List<TableBean> listTableCols(TableBean vo);
}

