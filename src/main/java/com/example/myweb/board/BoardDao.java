package com.example.myweb.board;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	public static final List<BoardDto> boardList = new ArrayList<BoardDto>();
	private static int seq = 1;
	//static Date date = new Date();
	//static DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	//static String formattedDate = dateFormat.format(date);
	static {
		boardList.add(new BoardDto(seq++, "test", "글 쓰기 연습", "글 쓰기 내용", "2024-06-03", 0));
		boardList.add(new BoardDto(seq++, "test2", "글 쓰기 연습2", "글 쓰기 내용2", "2024-06-03", 0));
		boardList.add(new BoardDto(seq++, "test3", "글 쓰기 연습3", "글 쓰기 내용3", "2024-06-03", 0));
		boardList.add(new BoardDto(seq++, "test4", "글 쓰기 연습4", "글 쓰기 내용4", "2024-06-03", 0));
	}
	
	public List<BoardDto> selectAll() {
		return boardList;
	}
	
	public BoardDto findBySeq(int seq) {
		BoardDto dto = new BoardDto(seq);
		int idx = boardList.indexOf(dto);
		if(idx != -1) {
			return boardList.get(idx);
		}
		return null;
	}
	
	public void insert(BoardDto dto) {
		boardList.add(dto);
	}
}
