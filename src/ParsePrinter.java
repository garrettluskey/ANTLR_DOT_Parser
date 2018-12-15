
// This is the listener class for program 5.
// This class works with the parser to beautify
// any input DOT code.
// Author:: Andrew Cummings

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParsePrinter implements DOTListener {

	public void enterEveryRule(ParserRuleContext ctx) {
		// System.out.println(ctx.getText());
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {

	}

	@Override
	public void enterNode_stmt(DOTParser.Node_stmtContext ctx) {

		// TODO Auto-generated method stub
		// System.out.println(ctx.getText());

	}

	@Override
	public void exitNode_stmt(DOTParser.Node_stmtContext ctx) {

	}

	@Override
	public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
		System.out.println("Start recognizing an edge statement");
	}

	@Override
	public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx) {
		System.out.println("Finish recognizing an edge statement");

	}

	@Override
	public void enterGraph(DOTParser.GraphContext ctx) {

		
			System.out.println("Start recognizing a digraph.");
			System.out.println("Start recognizing a cluster");

	}

	@Override
	public void exitGraph(DOTParser.GraphContext ctx) {
		System.out.println("Finish recognizing a cluster");
		System.out.println("Finish recognizing a digraph");
	}

	@Override
	public void enterA_list(DOTParser.A_listContext ctx) {
		
		for(int i = 0; i < ctx.getText().length() - ctx.getText().replace("=", "").length();i++) {
			System.out.println("Start recognizing a property");
			System.out.println("Finish recognizing a property");
		}
		
	

	}

	@Override
	public void exitA_list(DOTParser.A_listContext ctx) {
		
	
	}

	@Override
	public void enterAttr_list(DOTParser.Attr_listContext ctx) {

	}

	@Override
	public void exitAttr_list(DOTParser.Attr_listContext ctx) {

	}

	@Override
	public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) {

	}

	@Override
	public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) {

	}

	@Override
	public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx) {

	}

	@Override
	public void exitEdgeRHS(DOTParser.EdgeRHSContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEdgeop(DOTParser.EdgeopContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitEdgeop(DOTParser.EdgeopContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void enterPort(DOTParser.PortContext ctx) {

	}

	@Override
	public void exitPort(DOTParser.PortContext ctx) {

	}

	@Override
	public void enterSubgraph(DOTParser.SubgraphContext ctx) {
		System.out.println("Start recognizing a subgraph");
		System.out.println("Start recognizing a cluster");
	}

	@Override
	public void exitSubgraph(DOTParser.SubgraphContext ctx) {
		System.out.println("Finish recognizing a cluster");
		System.out.println("Finish recognizing a subgraph");
		
	}

	@Override
	public void enterStmt_list(DOTParser.Stmt_listContext ctx) {

	}

	@Override
	public void exitStmt_list(DOTParser.Stmt_listContext ctx) {

	}

	@Override
	public void enterId(DOTParser.IdContext ctx) {

	}

	@Override
	public void exitId(DOTParser.IdContext ctx) {


	}

	@Override
	public void enterStmt(DOTParser.StmtContext ctx) {
			if(ctx.getChildCount() == 3) {
				System.out.println("Start recognizing property");
				System.out.println("Finish recognizing property");
			}
			

	}

	@Override
	public void exitStmt(DOTParser.StmtContext ctx) {
		
	}

	@Override
	public void enterNode_id(DOTParser.Node_idContext ctx) {


	}

	@Override
	public void exitNode_id(DOTParser.Node_idContext ctx) {


	}

}