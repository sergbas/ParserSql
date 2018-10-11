package ru19july.bask.parsersql;
// Generated from C:/Projects/q4/SQL\TSqlParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSqlParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(ru19july.bask.parsersql.TSqlParser.Tsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(ru19july.bask.parsersql.TSqlParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(ru19july.bask.parsersql.TSqlParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clause(ru19july.bask.parsersql.TSqlParser.Sql_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(ru19july.bask.parsersql.TSqlParser.Dml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(ru19july.bask.parsersql.TSqlParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_statement(ru19july.bask.parsersql.TSqlParser.Backup_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCfl_statement(ru19july.bask.parsersql.TSqlParser.Cfl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(ru19july.bask.parsersql.TSqlParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(ru19july.bask.parsersql.TSqlParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(ru19july.bask.parsersql.TSqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(ru19july.bask.parsersql.TSqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(ru19july.bask.parsersql.TSqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ru19july.bask.parsersql.TSqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(ru19july.bask.parsersql.TSqlParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_error_number(ru19july.bask.parsersql.TSqlParser.Throw_error_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_message(ru19july.bask.parsersql.TSqlParser.Throw_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_state(ru19july.bask.parsersql.TSqlParser.Throw_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(ru19july.bask.parsersql.TSqlParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_statement(ru19july.bask.parsersql.TSqlParser.Waitfor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(ru19july.bask.parsersql.TSqlParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(ru19july.bask.parsersql.TSqlParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseerror_statement(ru19july.bask.parsersql.TSqlParser.Raiseerror_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(ru19july.bask.parsersql.TSqlParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#another_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnother_statement(ru19july.bask.parsersql.TSqlParser.Another_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_application_role(ru19july.bask.parsersql.TSqlParser.Alter_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_application_role(ru19july.bask.parsersql.TSqlParser.Create_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_aggregate(ru19july.bask.parsersql.TSqlParser.Drop_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_application_role(ru19july.bask.parsersql.TSqlParser.Drop_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly(ru19july.bask.parsersql.TSqlParser.Alter_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_start(ru19july.bask.parsersql.TSqlParser.Alter_assembly_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_clause(ru19july.bask.parsersql.TSqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_from_clause(ru19july.bask.parsersql.TSqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_from_clause_start(ru19july.bask.parsersql.TSqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop_clause(ru19july.bask.parsersql.TSqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop_multiple_files(ru19july.bask.parsersql.TSqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop(ru19july.bask.parsersql.TSqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_add_clause(ru19july.bask.parsersql.TSqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asssembly_add_clause_start(ru19july.bask.parsersql.TSqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_client_file_clause(ru19july.bask.parsersql.TSqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_file_name(ru19july.bask.parsersql.TSqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_file_bits(ru19july.bask.parsersql.TSqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_as(ru19july.bask.parsersql.TSqlParser.Alter_assembly_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_with_clause(ru19july.bask.parsersql.TSqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_with(ru19july.bask.parsersql.TSqlParser.Alter_assembly_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClient_assembly_specifier(ru19july.bask.parsersql.TSqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#assembly_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly_option(ru19july.bask.parsersql.TSqlParser.Assembly_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#network_file_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_file_share(ru19july.bask.parsersql.TSqlParser.Network_file_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#network_computer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_computer(ru19july.bask.parsersql.TSqlParser.Network_computerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#network_file_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_file_start(ru19july.bask.parsersql.TSqlParser.Network_file_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_path(ru19july.bask.parsersql.TSqlParser.File_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_directory_path_separator(ru19july.bask.parsersql.TSqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#local_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_file(ru19july.bask.parsersql.TSqlParser.Local_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#local_drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_drive(ru19july.bask.parsersql.TSqlParser.Local_driveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_local_files(ru19july.bask.parsersql.TSqlParser.Multiple_local_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_local_file_start(ru19july.bask.parsersql.TSqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_assembly(ru19july.bask.parsersql.TSqlParser.Create_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_assembly(ru19july.bask.parsersql.TSqlParser.Drop_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key(ru19july.bask.parsersql.TSqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key_start(ru19july.bask.parsersql.TSqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option(ru19july.bask.parsersql.TSqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option_start(ru19july.bask.parsersql.TSqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_password_change_option(ru19july.bask.parsersql.TSqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_asymmetric_key(ru19july.bask.parsersql.TSqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_asymmetric_key(ru19july.bask.parsersql.TSqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization(ru19july.bask.parsersql.TSqlParser.Alter_authorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorization_grantee(ru19july.bask.parsersql.TSqlParser.Authorization_granteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_to(ru19july.bask.parsersql.TSqlParser.Entity_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#colon_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_colon(ru19july.bask.parsersql.TSqlParser.Colon_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_start(ru19july.bask.parsersql.TSqlParser.Alter_authorization_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_sql_database(ru19july.bask.parsersql.TSqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_azure_dw(ru19july.bask.parsersql.TSqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_parallel_dw(ru19july.bask.parsersql.TSqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(ru19july.bask.parsersql.TSqlParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_sql_database(ru19july.bask.parsersql.TSqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_azure_dw(ru19july.bask.parsersql.TSqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_parallel_dw(ru19july.bask.parsersql.TSqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_availability_group(ru19july.bask.parsersql.TSqlParser.Drop_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group(ru19july.bask.parsersql.TSqlParser.Alter_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_start(ru19july.bask.parsersql.TSqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_options(ru19july.bask.parsersql.TSqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_broker_priority(ru19july.bask.parsersql.TSqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_broker_priority(ru19july.bask.parsersql.TSqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_certificate(ru19july.bask.parsersql.TSqlParser.Alter_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_encryption_key(ru19july.bask.parsersql.TSqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_encryption_key(ru19july.bask.parsersql.TSqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_certificate(ru19july.bask.parsersql.TSqlParser.Drop_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_encryption_key(ru19july.bask.parsersql.TSqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_master_key(ru19july.bask.parsersql.TSqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_contract(ru19july.bask.parsersql.TSqlParser.Drop_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_credential(ru19july.bask.parsersql.TSqlParser.Drop_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_cryptograhic_provider(ru19july.bask.parsersql.TSqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(ru19july.bask.parsersql.TSqlParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_audit_specification(ru19july.bask.parsersql.TSqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_scoped_credential(ru19july.bask.parsersql.TSqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_default(ru19july.bask.parsersql.TSqlParser.Drop_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_endpoint(ru19july.bask.parsersql.TSqlParser.Drop_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_data_source(ru19july.bask.parsersql.TSqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_file_format(ru19july.bask.parsersql.TSqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_library(ru19july.bask.parsersql.TSqlParser.Drop_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_resource_pool(ru19july.bask.parsersql.TSqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_table(ru19july.bask.parsersql.TSqlParser.Drop_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_notifications(ru19july.bask.parsersql.TSqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_session(ru19july.bask.parsersql.TSqlParser.Drop_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_catalog(ru19july.bask.parsersql.TSqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_index(ru19july.bask.parsersql.TSqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_stoplist(ru19july.bask.parsersql.TSqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_login(ru19july.bask.parsersql.TSqlParser.Drop_loginContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_master_key(ru19july.bask.parsersql.TSqlParser.Drop_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_message_type(ru19july.bask.parsersql.TSqlParser.Drop_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_partition_function(ru19july.bask.parsersql.TSqlParser.Drop_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_partition_scheme(ru19july.bask.parsersql.TSqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_queue(ru19july.bask.parsersql.TSqlParser.Drop_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_remote_service_binding(ru19july.bask.parsersql.TSqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_resource_pool(ru19july.bask.parsersql.TSqlParser.Drop_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_db_role(ru19july.bask.parsersql.TSqlParser.Drop_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_route(ru19july.bask.parsersql.TSqlParser.Drop_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_rule(ru19july.bask.parsersql.TSqlParser.Drop_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema(ru19july.bask.parsersql.TSqlParser.Drop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_search_property_list(ru19july.bask.parsersql.TSqlParser.Drop_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_security_policy(ru19july.bask.parsersql.TSqlParser.Drop_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(ru19july.bask.parsersql.TSqlParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_audit(ru19july.bask.parsersql.TSqlParser.Drop_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_audit_specification(ru19july.bask.parsersql.TSqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_role(ru19july.bask.parsersql.TSqlParser.Drop_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_service(ru19july.bask.parsersql.TSqlParser.Drop_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_signature(ru19july.bask.parsersql.TSqlParser.Drop_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics_name_azure_dw_and_pdw(ru19july.bask.parsersql.TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_symmetric_key(ru19july.bask.parsersql.TSqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_synonym(ru19july.bask.parsersql.TSqlParser.Drop_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user(ru19july.bask.parsersql.TSqlParser.Drop_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_workload_group(ru19july.bask.parsersql.TSqlParser.Drop_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_xml_schema_collection(ru19july.bask.parsersql.TSqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_trigger(ru19july.bask.parsersql.TSqlParser.Disable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_trigger(ru19july.bask.parsersql.TSqlParser.Enable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#lock_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table(ru19july.bask.parsersql.TSqlParser.Lock_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#truncate_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table(ru19july.bask.parsersql.TSqlParser.Truncate_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_master_key(ru19july.bask.parsersql.TSqlParser.Create_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_credential(ru19july.bask.parsersql.TSqlParser.Alter_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_credential(ru19july.bask.parsersql.TSqlParser.Create_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_cryptographic_provider(ru19july.bask.parsersql.TSqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cryptographic_provider(ru19july.bask.parsersql.TSqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_notification(ru19july.bask.parsersql.TSqlParser.Create_event_notificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_event_session(ru19july.bask.parsersql.TSqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_expression(ru19july.bask.parsersql.TSqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_factor(ru19july.bask.parsersql.TSqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_leaf(ru19july.bask.parsersql.TSqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_data_source(ru19july.bask.parsersql.TSqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_library(ru19july.bask.parsersql.TSqlParser.Alter_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_library(ru19july.bask.parsersql.TSqlParser.Create_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_resource_pool(ru19july.bask.parsersql.TSqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_resource_pool(ru19july.bask.parsersql.TSqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_catalog(ru19july.bask.parsersql.TSqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_catalog(ru19july.bask.parsersql.TSqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_stoplist(ru19july.bask.parsersql.TSqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_stoplist(ru19july.bask.parsersql.TSqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_sql_server(ru19july.bask.parsersql.TSqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_sql_server(ru19july.bask.parsersql.TSqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_azure_sql(ru19july.bask.parsersql.TSqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_azure_sql(ru19july.bask.parsersql.TSqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_azure_sql_dw_and_pdw(ru19july.bask.parsersql.TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_pdw(ru19july.bask.parsersql.TSqlParser.Create_login_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_sql_server(ru19july.bask.parsersql.TSqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_sql_server(ru19july.bask.parsersql.TSqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_azure_sql(ru19july.bask.parsersql.TSqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_azure_sql(ru19july.bask.parsersql.TSqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_message_type(ru19july.bask.parsersql.TSqlParser.Alter_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_function(ru19july.bask.parsersql.TSqlParser.Alter_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_scheme(ru19july.bask.parsersql.TSqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_remote_service_binding(ru19july.bask.parsersql.TSqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_remote_service_binding(ru19july.bask.parsersql.TSqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_resource_pool(ru19july.bask.parsersql.TSqlParser.Create_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_resource_governor(ru19july.bask.parsersql.TSqlParser.Alter_resource_governorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_db_role(ru19july.bask.parsersql.TSqlParser.Alter_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_db_role(ru19july.bask.parsersql.TSqlParser.Create_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_route(ru19july.bask.parsersql.TSqlParser.Create_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rule(ru19july.bask.parsersql.TSqlParser.Create_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_sql(ru19july.bask.parsersql.TSqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema(ru19july.bask.parsersql.TSqlParser.Create_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_azure_sql_dw_and_pdw(ru19july.bask.parsersql.TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_azure_sql_dw_and_pdw(ru19july.bask.parsersql.TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_search_property_list(ru19july.bask.parsersql.TSqlParser.Create_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_policy(ru19july.bask.parsersql.TSqlParser.Create_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(ru19july.bask.parsersql.TSqlParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(ru19july.bask.parsersql.TSqlParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit(ru19july.bask.parsersql.TSqlParser.Alter_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit(ru19july.bask.parsersql.TSqlParser.Create_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit_specification(ru19july.bask.parsersql.TSqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit_specification(ru19july.bask.parsersql.TSqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_configuration(ru19july.bask.parsersql.TSqlParser.Alter_server_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role(ru19july.bask.parsersql.TSqlParser.Alter_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_role(ru19july.bask.parsersql.TSqlParser.Create_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role_pdw(ru19july.bask.parsersql.TSqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service(ru19july.bask.parsersql.TSqlParser.Alter_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_service(ru19july.bask.parsersql.TSqlParser.Create_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service_master_key(ru19july.bask.parsersql.TSqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_symmetric_key(ru19july.bask.parsersql.TSqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_symmetric_key(ru19july.bask.parsersql.TSqlParser.Create_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym(ru19july.bask.parsersql.TSqlParser.Create_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user(ru19july.bask.parsersql.TSqlParser.Alter_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(ru19july.bask.parsersql.TSqlParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_azure_sql_dw(ru19july.bask.parsersql.TSqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_azure_sql(ru19july.bask.parsersql.TSqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_workload_group(ru19july.bask.parsersql.TSqlParser.Alter_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_workload_group(ru19july.bask.parsersql.TSqlParser.Create_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_xml_schema_collection(ru19july.bask.parsersql.TSqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_queue(ru19july.bask.parsersql.TSqlParser.Create_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_settings(ru19july.bask.parsersql.TSqlParser.Queue_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_queue(ru19july.bask.parsersql.TSqlParser.Alter_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_action(ru19july.bask.parsersql.TSqlParser.Queue_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_rebuild_options(ru19july.bask.parsersql.TSqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_contract(ru19july.bask.parsersql.TSqlParser.Create_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversation_statement(ru19july.bask.parsersql.TSqlParser.Conversation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#message_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_statement(ru19july.bask.parsersql.TSqlParser.Message_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(ru19july.bask.parsersql.TSqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#merge_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_matched(ru19july.bask.parsersql.TSqlParser.Merge_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_not_matched(ru19july.bask.parsersql.TSqlParser.Merge_not_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(ru19july.bask.parsersql.TSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement_from(ru19july.bask.parsersql.TSqlParser.Delete_statement_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(ru19july.bask.parsersql.TSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement_value(ru19july.bask.parsersql.TSqlParser.Insert_statement_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#receive_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_statement(ru19july.bask.parsersql.TSqlParser.Receive_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(ru19july.bask.parsersql.TSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(ru19july.bask.parsersql.TSqlParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(ru19july.bask.parsersql.TSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(ru19july.bask.parsersql.TSqlParser.Output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(ru19july.bask.parsersql.TSqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#output_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_column_name(ru19july.bask.parsersql.TSqlParser.Output_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(ru19july.bask.parsersql.TSqlParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(ru19july.bask.parsersql.TSqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_procedure(ru19july.bask.parsersql.TSqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_trigger(ru19july.bask.parsersql.TSqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_dml_trigger(ru19july.bask.parsersql.TSqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_trigger_option(ru19july.bask.parsersql.TSqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_trigger_operation(ru19july.bask.parsersql.TSqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_ddl_trigger(ru19july.bask.parsersql.TSqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_trigger_operation(ru19july.bask.parsersql.TSqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_function(ru19july.bask.parsersql.TSqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_select(ru19july.bask.parsersql.TSqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_table(ru19july.bask.parsersql.TSqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_scalar(ru19july.bask.parsersql.TSqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#procedure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_param(ru19july.bask.parsersql.TSqlParser.Procedure_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#procedure_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_option(ru19july.bask.parsersql.TSqlParser.Procedure_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#function_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_option(ru19july.bask.parsersql.TSqlParser.Function_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(ru19july.bask.parsersql.TSqlParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#update_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statistics(ru19july.bask.parsersql.TSqlParser.Update_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(ru19july.bask.parsersql.TSqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_options(ru19july.bask.parsersql.TSqlParser.Table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(ru19july.bask.parsersql.TSqlParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#view_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_attribute(ru19july.bask.parsersql.TSqlParser.View_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(ru19july.bask.parsersql.TSqlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(ru19july.bask.parsersql.TSqlParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_optionspec(ru19july.bask.parsersql.TSqlParser.Database_optionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#auto_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_option(ru19july.bask.parsersql.TSqlParser.Auto_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option(ru19july.bask.parsersql.TSqlParser.Change_tracking_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option_list(ru19july.bask.parsersql.TSqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#containment_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainment_option(ru19july.bask.parsersql.TSqlParser.Containment_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option(ru19july.bask.parsersql.TSqlParser.Cursor_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_endpoint(ru19july.bask.parsersql.TSqlParser.Alter_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_mirroring_option(ru19july.bask.parsersql.TSqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_set_option(ru19july.bask.parsersql.TSqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_partner(ru19july.bask.parsersql.TSqlParser.Mirroring_partnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_witness(ru19july.bask.parsersql.TSqlParser.Mirroring_witnessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_partner_equal(ru19july.bask.parsersql.TSqlParser.Witness_partner_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#partner_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_option(ru19july.bask.parsersql.TSqlParser.Partner_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#witness_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_option(ru19july.bask.parsersql.TSqlParser.Witness_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#witness_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_server(ru19july.bask.parsersql.TSqlParser.Witness_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#partner_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_server(ru19july.bask.parsersql.TSqlParser.Partner_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_host_port_seperator(ru19july.bask.parsersql.TSqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_server_tcp_prefix(ru19july.bask.parsersql.TSqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#port_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_number(ru19july.bask.parsersql.TSqlParser.Port_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(ru19july.bask.parsersql.TSqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_correlation_optimization_option(ru19july.bask.parsersql.TSqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_encryption_option(ru19july.bask.parsersql.TSqlParser.Db_encryption_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_state_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_state_option(ru19july.bask.parsersql.TSqlParser.Db_state_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_update_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_update_option(ru19july.bask.parsersql.TSqlParser.Db_update_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_user_access_option(ru19july.bask.parsersql.TSqlParser.Db_user_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_durability_option(ru19july.bask.parsersql.TSqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#external_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_access_option(ru19july.bask.parsersql.TSqlParser.External_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#hadr_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHadr_options(ru19july.bask.parsersql.TSqlParser.Hadr_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_page_allocation_option(ru19july.bask.parsersql.TSqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterization_option(ru19july.bask.parsersql.TSqlParser.Parameterization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#recovery_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_option(ru19july.bask.parsersql.TSqlParser.Recovery_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_broker_option(ru19july.bask.parsersql.TSqlParser.Service_broker_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshot_option(ru19july.bask.parsersql.TSqlParser.Snapshot_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_option(ru19july.bask.parsersql.TSqlParser.Sql_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_recovery_time_option(ru19july.bask.parsersql.TSqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination(ru19july.bask.parsersql.TSqlParser.TerminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(ru19july.bask.parsersql.TSqlParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_relational_or_xml_or_spatial_index(ru19july.bask.parsersql.TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_backward_compatible_index(ru19july.bask.parsersql.TSqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(ru19july.bask.parsersql.TSqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(ru19july.bask.parsersql.TSqlParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_dml_trigger(ru19july.bask.parsersql.TSqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_ddl_trigger(ru19july.bask.parsersql.TSqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(ru19july.bask.parsersql.TSqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics(ru19july.bask.parsersql.TSqlParser.Drop_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(ru19july.bask.parsersql.TSqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(ru19july.bask.parsersql.TSqlParser.Drop_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(ru19july.bask.parsersql.TSqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(ru19july.bask.parsersql.TSqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(ru19july.bask.parsersql.TSqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(ru19july.bask.parsersql.TSqlParser.OpenqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(ru19july.bask.parsersql.TSqlParser.OpendatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(ru19july.bask.parsersql.TSqlParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(ru19july.bask.parsersql.TSqlParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_database(ru19july.bask.parsersql.TSqlParser.Backup_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_log(ru19july.bask.parsersql.TSqlParser.Backup_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_certificate(ru19july.bask.parsersql.TSqlParser.Backup_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_master_key(ru19july.bask.parsersql.TSqlParser.Backup_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_service_master_key(ru19july.bask.parsersql.TSqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(ru19july.bask.parsersql.TSqlParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_body(ru19july.bask.parsersql.TSqlParser.Execute_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg(ru19july.bask.parsersql.TSqlParser.Execute_statement_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_var_string(ru19july.bask.parsersql.TSqlParser.Execute_var_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#security_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_statement(ru19july.bask.parsersql.TSqlParser.Security_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_certificate(ru19july.bask.parsersql.TSqlParser.Create_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#existing_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_keys(ru19july.bask.parsersql.TSqlParser.Existing_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#private_key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_key_options(ru19july.bask.parsersql.TSqlParser.Private_key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_new_keys(ru19july.bask.parsersql.TSqlParser.Generate_new_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#date_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_options(ru19july.bask.parsersql.TSqlParser.Date_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#open_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_key(ru19july.bask.parsersql.TSqlParser.Open_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#close_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_key(ru19july.bask.parsersql.TSqlParser.Close_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_key(ru19july.bask.parsersql.TSqlParser.Create_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_options(ru19july.bask.parsersql.TSqlParser.Key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#algorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm(ru19july.bask.parsersql.TSqlParser.AlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_mechanism(ru19july.bask.parsersql.TSqlParser.Encryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecryption_mechanism(ru19july.bask.parsersql.TSqlParser.Decryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#grant_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_permission(ru19july.bask.parsersql.TSqlParser.Grant_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(ru19july.bask.parsersql.TSqlParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(ru19july.bask.parsersql.TSqlParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#go_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_statement(ru19july.bask.parsersql.TSqlParser.Go_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(ru19july.bask.parsersql.TSqlParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetuser_statement(ru19july.bask.parsersql.TSqlParser.Setuser_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_clause(ru19july.bask.parsersql.TSqlParser.Dbcc_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_options(ru19july.bask.parsersql.TSqlParser.Dbcc_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_clause(ru19july.bask.parsersql.TSqlParser.Execute_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local(ru19july.bask.parsersql.TSqlParser.Declare_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_definition(ru19july.bask.parsersql.TSqlParser.Table_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_type_definition(ru19july.bask.parsersql.TSqlParser.Xml_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_schema_collection(ru19july.bask.parsersql.TSqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraints(ru19july.bask.parsersql.TSqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(ru19july.bask.parsersql.TSqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(ru19july.bask.parsersql.TSqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialized_column_definition(ru19july.bask.parsersql.TSqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(ru19july.bask.parsersql.TSqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(ru19july.bask.parsersql.TSqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#on_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete(ru19july.bask.parsersql.TSqlParser.On_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#on_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update(ru19july.bask.parsersql.TSqlParser.On_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(ru19july.bask.parsersql.TSqlParser.Index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(ru19july.bask.parsersql.TSqlParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(ru19july.bask.parsersql.TSqlParser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common(ru19july.bask.parsersql.TSqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common_partial(ru19july.bask.parsersql.TSqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_cursor(ru19july.bask.parsersql.TSqlParser.Fetch_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(ru19july.bask.parsersql.TSqlParser.Set_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_LOCAL_ID(ru19july.bask.parsersql.TSqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ru19july.bask.parsersql.TSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(ru19july.bask.parsersql.TSqlParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(ru19july.bask.parsersql.TSqlParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_expression(ru19july.bask.parsersql.TSqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(ru19july.bask.parsersql.TSqlParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(ru19july.bask.parsersql.TSqlParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(ru19july.bask.parsersql.TSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(ru19july.bask.parsersql.TSqlParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(ru19july.bask.parsersql.TSqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(ru19july.bask.parsersql.TSqlParser.Update_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_list(ru19july.bask.parsersql.TSqlParser.Search_condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(ru19july.bask.parsersql.TSqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_and(ru19july.bask.parsersql.TSqlParser.Search_condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_not(ru19july.bask.parsersql.TSqlParser.Search_condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(ru19july.bask.parsersql.TSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(ru19july.bask.parsersql.TSqlParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_union(ru19july.bask.parsersql.TSqlParser.Sql_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(ru19july.bask.parsersql.TSqlParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_clause(ru19july.bask.parsersql.TSqlParser.Top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#top_percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_percent(ru19july.bask.parsersql.TSqlParser.Top_percentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#top_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_count(ru19july.bask.parsersql.TSqlParser.Top_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(ru19july.bask.parsersql.TSqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(ru19july.bask.parsersql.TSqlParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(ru19july.bask.parsersql.TSqlParser.Xml_common_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(ru19july.bask.parsersql.TSqlParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(ru19july.bask.parsersql.TSqlParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(ru19july.bask.parsersql.TSqlParser.Option_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(ru19july.bask.parsersql.TSqlParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(ru19july.bask.parsersql.TSqlParser.Optimize_for_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(ru19july.bask.parsersql.TSqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_method_arguments(ru19july.bask.parsersql.TSqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsterisk(ru19july.bask.parsersql.TSqlParser.AsteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_elem(ru19july.bask.parsersql.TSqlParser.Column_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#udt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_elem(ru19july.bask.parsersql.TSqlParser.Udt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#expression_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_elem(ru19july.bask.parsersql.TSqlParser.Expression_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(ru19july.bask.parsersql.TSqlParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_sources(ru19july.bask.parsersql.TSqlParser.Table_sourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(ru19july.bask.parsersql.TSqlParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(ru19july.bask.parsersql.TSqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item(ru19july.bask.parsersql.TSqlParser.Table_source_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#open_xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_xml(ru19july.bask.parsersql.TSqlParser.Open_xmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_declaration(ru19july.bask.parsersql.TSqlParser.Schema_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_declaration(ru19july.bask.parsersql.TSqlParser.Column_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(ru19july.bask.parsersql.TSqlParser.Change_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#join_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_part(ru19july.bask.parsersql.TSqlParser.Join_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(ru19july.bask.parsersql.TSqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(ru19july.bask.parsersql.TSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name_list(ru19july.bask.parsersql.TSqlParser.Full_column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(ru19july.bask.parsersql.TSqlParser.Table_name_with_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(ru19july.bask.parsersql.TSqlParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(ru19july.bask.parsersql.TSqlParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(ru19july.bask.parsersql.TSqlParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRANKING_WINDOWED_FUNC(ru19july.bask.parsersql.TSqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAGGREGATE_WINDOWED_FUNC(ru19july.bask.parsersql.TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANALYTIC_WINDOWED_FUNC(ru19july.bask.parsersql.TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCALAR_FUNCTION(ru19july.bask.parsersql.TSqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBINARY_CHECKSUM(ru19july.bask.parsersql.TSqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCAST(ru19july.bask.parsersql.TSqlParser.CASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONVERT(ru19july.bask.parsersql.TSqlParser.CONVERTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHECKSUM(ru19july.bask.parsersql.TSqlParser.CHECKSUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOALESCE(ru19july.bask.parsersql.TSqlParser.COALESCEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENT_TIMESTAMP(ru19july.bask.parsersql.TSqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENT_USER(ru19july.bask.parsersql.TSqlParser.CURRENT_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEADD(ru19july.bask.parsersql.TSqlParser.DATEADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEDIFF(ru19july.bask.parsersql.TSqlParser.DATEDIFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATENAME(ru19july.bask.parsersql.TSqlParser.DATENAMEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEPART(ru19july.bask.parsersql.TSqlParser.DATEPARTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETDATE(ru19july.bask.parsersql.TSqlParser.GETDATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETUTCDATE(ru19july.bask.parsersql.TSqlParser.GETUTCDATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTITY(ru19july.bask.parsersql.TSqlParser.IDENTITYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMIN_ACTIVE_ROWVERSION(ru19july.bask.parsersql.TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULLIF(ru19july.bask.parsersql.TSqlParser.NULLIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTUFF(ru19july.bask.parsersql.TSqlParser.STUFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSESSION_USER(ru19july.bask.parsersql.TSqlParser.SESSION_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSYSTEM_USER(ru19july.bask.parsersql.TSqlParser.SYSTEM_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitISNULL(ru19july.bask.parsersql.TSqlParser.ISNULLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXML_DATA_TYPE_FUNC(ru19july.bask.parsersql.TSqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_data_type_methods(ru19july.bask.parsersql.TSqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#value_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_method(ru19july.bask.parsersql.TSqlParser.Value_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#query_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_method(ru19july.bask.parsersql.TSqlParser.Query_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#exist_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist_method(ru19july.bask.parsersql.TSqlParser.Exist_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#modify_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_method(ru19july.bask.parsersql.TSqlParser.Modify_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#nodes_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodes_method(ru19july.bask.parsersql.TSqlParser.Nodes_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(ru19july.bask.parsersql.TSqlParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_search_condition_section(ru19july.bask.parsersql.TSqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_column_alias(ru19july.bask.parsersql.TSqlParser.As_column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(ru19july.bask.parsersql.TSqlParser.As_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(ru19july.bask.parsersql.TSqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_table_hints(ru19july.bask.parsersql.TSqlParser.With_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_with_table_hints(ru19july.bask.parsersql.TSqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(ru19july.bask.parsersql.TSqlParser.Table_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(ru19july.bask.parsersql.TSqlParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(ru19july.bask.parsersql.TSqlParser.Column_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(ru19july.bask.parsersql.TSqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(ru19july.bask.parsersql.TSqlParser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(ru19july.bask.parsersql.TSqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(ru19july.bask.parsersql.TSqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(ru19july.bask.parsersql.TSqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_windowed_function(ru19july.bask.parsersql.TSqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(ru19july.bask.parsersql.TSqlParser.All_distinct_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(ru19july.bask.parsersql.TSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(ru19july.bask.parsersql.TSqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(ru19july.bask.parsersql.TSqlParser.Window_frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(ru19july.bask.parsersql.TSqlParser.Window_frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(ru19july.bask.parsersql.TSqlParser.Window_frame_precedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(ru19july.bask.parsersql.TSqlParser.Window_frame_followingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(ru19july.bask.parsersql.TSqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_filestream_option(ru19july.bask.parsersql.TSqlParser.Database_filestream_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_file_spec(ru19july.bask.parsersql.TSqlParser.Database_file_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_group(ru19july.bask.parsersql.TSqlParser.File_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(ru19july.bask.parsersql.TSqlParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name(ru19july.bask.parsersql.TSqlParser.Entity_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_for_azure_dw(ru19july.bask.parsersql.TSqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_for_parallel_dw(ru19july.bask.parsersql.TSqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(ru19july.bask.parsersql.TSqlParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(ru19july.bask.parsersql.TSqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(ru19july.bask.parsersql.TSqlParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name(ru19july.bask.parsersql.TSqlParser.Func_proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(ru19july.bask.parsersql.TSqlParser.Ddl_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(ru19july.bask.parsersql.TSqlParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list_with_order(ru19july.bask.parsersql.TSqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(ru19july.bask.parsersql.TSqlParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(ru19july.bask.parsersql.TSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(ru19july.bask.parsersql.TSqlParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(ru19july.bask.parsersql.TSqlParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(ru19july.bask.parsersql.TSqlParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#null_or_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_or_default(ru19july.bask.parsersql.TSqlParser.Null_or_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(ru19july.bask.parsersql.TSqlParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_timer(ru19july.bask.parsersql.TSqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_dialog(ru19july.bask.parsersql.TSqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#contract_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_name(ru19july.bask.parsersql.TSqlParser.Contract_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#service_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_name(ru19july.bask.parsersql.TSqlParser.Service_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#end_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_conversation(ru19july.bask.parsersql.TSqlParser.End_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_conversation(ru19july.bask.parsersql.TSqlParser.Waitfor_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#get_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_conversation(ru19july.bask.parsersql.TSqlParser.Get_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_id(ru19july.bask.parsersql.TSqlParser.Queue_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#send_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_conversation(ru19july.bask.parsersql.TSqlParser.Send_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(ru19july.bask.parsersql.TSqlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(ru19july.bask.parsersql.TSqlParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ru19july.bask.parsersql.TSqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(ru19july.bask.parsersql.TSqlParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ru19july.bask.parsersql.TSqlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(ru19july.bask.parsersql.TSqlParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(ru19july.bask.parsersql.TSqlParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(ru19july.bask.parsersql.TSqlParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_size(ru19july.bask.parsersql.TSqlParser.File_sizeContext ctx);
}