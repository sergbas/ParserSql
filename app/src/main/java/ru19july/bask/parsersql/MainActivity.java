package ru19july.bask.parsersql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.Console;

import ru19july.bask.parsersql.SqlParser.TSqlParserBaseListener;

public class MainActivity extends AppCompatActivity {

    //add
    //idea.max.intellisense.filesize=999999
    //to Help > Edit Custom Properties
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String source = "SELECT * FROM AnyTable";

        try {
            ParseTreeListener listener = new Printer();

            ru19july.bask.parsersql.TSqlLexer lexer = new ru19july.bask.parsersql.TSqlLexer(new ANTLRInputStream(source));
            ru19july.bask.parsersql.TSqlParser parser = new ru19july.bask.parsersql.TSqlParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.tsql_file();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            //EvalVisitor visitor = new EvalVisitor();
            //Value value = visitor.visit(tree);
            //out.setText(source + " = " + value);
        }
        catch (RecognitionException e) {
            //out.setText("Oops: " + e.getMessage());
        }
    }


    public class Printer extends TSqlParserBaseListener
    {
        public boolean StatementFound;

        private String alias = "";
/*
        @Override
        public void EnterQuery_specification(ru19july.bask.parsersql.TSqlParser.Query_specificationContext ctx)
        {
            mode = JoinMode.Undefined;
        }
        public override void EnterTable_sources(ru19july.bask.parsersql.TSqlParser.Table_sourcesContext ctx)
        {
            if (ctx.ChildCount > 1)
                mode = JoinMode.Where;
            branch = BranchType.Table_sources;
        }
        public override void EnterTable_source_item_joined([NotNull] ru19july.bask.parsersql.TSqlParser.Table_source_item_joinedContext ctx)
        {
            if ((mode == JoinMode.Undefined & ctx.ChildCount == 1) || (mode == JoinMode.Where))
                return;
            mode = JoinMode.Join;
            branch = BranchType.Table_sources;
        }
        public override void EnterTable_name_with_hint([NotNull] ru19july.bask.parsersql.TSqlParser.Table_name_with_hintContext ctx)
        {
            if (mode == JoinMode.Undefined)
                return;
            if (branch == BranchType.Table_sources)
                Console.WriteLine("\tBRANCH: {0}", branch.ToString());
            alias = "";
        }
        public override void EnterTable_name([NotNull] ru19july.bask.parsersql.TSqlParser.Table_nameContext ctx)
        {
            if (branch == BranchType.Search_condition || branch == BranchType.Select || mode == JoinMode.Undefined)
                return;
            Console.WriteLine("\t\tTABLE_NAME: {0}", ctx.GetText());
        }
        public override void EnterTable_alias([NotNull] ru19july.bask.parsersql.TSqlParser.Table_aliasContext ctx)
        {
            if (branch == BranchType.Search_condition || branch == BranchType.Select | mode == JoinMode.Undefined)
                return;
            alias = ctx.GetChild(0).GetText();
            Console.WriteLine("ALIAS:" + alias);
        }
        public override void EnterSearch_condition([NotNull] ru19july.bask.parsersql.TSqlParser.Search_conditionContext ctx)
        {
            if (mode == JoinMode.Undefined)
                return;
            branch = BranchType.Search_condition;
            Console.WriteLine("\t\t\tSearch_condition: {0}", ctx.GetText());
            return;
        }
        public override void EnterSelect_statement([NotNull] ru19july.bask.parsersql.TSqlParser.Select_statementContext ctx)
        {
            Console.WriteLine("Select_statement: {0}", ctx.GetText());
            branch = BranchType.Select;
            return;
        }
        */
    }
}
