import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Mylistener implements DOTListener {
	
		private int tabs = 0;
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterNode_stmt(DOTParser.Node_stmtContext ctx) {
			// TODO Auto-generated method stub
			// System.out.println(ctx.getText());
			
		}

		@Override
		public void exitNode_stmt(DOTParser.Node_stmtContext ctx) {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterGraph(DOTParser.GraphContext ctx) {
			// TODO Auto-generated method stub
			System.out.println("graph " + ctx.id().getText() + " {");
		}

		@Override
		public void exitGraph(DOTParser.GraphContext ctx) {
			// TODO Auto-generated method stub
			System.out.println("}");
		}

		@Override
		public void enterA_list(DOTParser.A_listContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitA_list(DOTParser.A_listContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterAttr_list(DOTParser.Attr_listContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitAttr_list(DOTParser.Attr_listContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx) {
			// TODO Auto-generated method stub
			
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitPort(DOTParser.PortContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterSubgraph(DOTParser.SubgraphContext ctx) {
			// TODO Auto-generated method stub
			printTabs();
			System.out.print("subgraph " + ctx.id().getText() + " {\n");
		}

		@Override
		public void exitSubgraph(DOTParser.SubgraphContext ctx) {
			// TODO Auto-generated method stub
			printTabs();
			System.out.print("}\n");
		}

		@Override
		public void enterStmt_list(DOTParser.Stmt_listContext ctx) {
			// TODO Auto-generated method stub
			tabs += 1;
			// System.out.println(ctx.getText());
			
		}

		@Override
		public void exitStmt_list(DOTParser.Stmt_listContext ctx) {
			// TODO Auto-generated method stub
			tabs -= 1;
			// System.out.println(ctx.getText());
		}

		@Override
		public void enterId(DOTParser.IdContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitId(DOTParser.IdContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterStmt(DOTParser.StmtContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitStmt(DOTParser.StmtContext ctx) {
			// TODO Auto-generated method stub
		}

		@Override
		public void enterNode_id(DOTParser.Node_idContext ctx) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void exitNode_id(DOTParser.Node_idContext ctx) {
			// TODO Auto-generated method stub
			
		}
		
		private void printTabs() {
			for(int i = 0; i < tabs; i++) {
				System.out.print("\t");
			}
		}
    }