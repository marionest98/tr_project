package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.FileinfoDto;

@Mapper
public interface FileinfoDao {
	int insertFile(FileinfoDto file);
	List<FileinfoDto> fileList();
	FileinfoDto fileOne(int Fileid);
}
