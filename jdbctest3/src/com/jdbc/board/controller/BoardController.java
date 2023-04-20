package com.jdbc.board.controller;

import java.util.List;
import java.util.Map;

import com.jdbc.board.model.dto.Board;
import com.jdbc.board.model.service.BoardService;
import com.jdbc.board.view.MainView;

public class BoardController {
	
		
		private BoardService service=new BoardService();
		private MainView view=new MainView();
		public void mainMenu() {
			view.mainMenu();
		}
		public void selectBoardAll() {
			List<Board> boards=service.selectBoardAll();
			
			view.printBoard(boards);
		}
		
		public void selectSearchBoard() {
			//검색할 항목(컬럼명), 검색어
			Map param=view.inputSearch();
			List<Board> boards=dao.searchBoard(param);
			Object conn;
			for(Board b: boards) {
				b.setComments(dao.selectBoardComment(conn, b.getBoardNO()));
			}
			close(conn);
			return;
			view.printBoard(boards);
		}
		
	

}
