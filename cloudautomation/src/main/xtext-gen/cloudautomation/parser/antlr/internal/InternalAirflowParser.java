package cloudautomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cloudautomation.services.AirflowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAirflowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Workflow'", "'{'", "'}'", "'Task'", "'dependsOn'", "'on'", "'Low'", "'Medium'", "'High'", "'Simple'", "'Compound'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAirflowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAirflowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAirflowParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAirflow.g"; }



     	private AirflowGrammarAccess grammarAccess;

        public InternalAirflowParser(TokenStream input, AirflowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AirflowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAirflow.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAirflow.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAirflow.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAirflow.g:71:1: ruleModel returns [EObject current=null] : ( (lv_workflows_0_0= ruleWorkflow ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_workflows_0_0 = null;



        	enterRule();

        try {
            // InternalAirflow.g:77:2: ( ( (lv_workflows_0_0= ruleWorkflow ) )* )
            // InternalAirflow.g:78:2: ( (lv_workflows_0_0= ruleWorkflow ) )*
            {
            // InternalAirflow.g:78:2: ( (lv_workflows_0_0= ruleWorkflow ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAirflow.g:79:3: (lv_workflows_0_0= ruleWorkflow )
            	    {
            	    // InternalAirflow.g:79:3: (lv_workflows_0_0= ruleWorkflow )
            	    // InternalAirflow.g:80:4: lv_workflows_0_0= ruleWorkflow
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getWorkflowsWorkflowParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_workflows_0_0=ruleWorkflow();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"workflows",
            	    					lv_workflows_0_0,
            	    					"cloudautomation.Airflow.Workflow");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWorkflow"
    // InternalAirflow.g:100:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalAirflow.g:100:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalAirflow.g:101:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalAirflow.g:107:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'Workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_tasks_4_0= ruleTask ) )* ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_6=null;
        EObject lv_tasks_4_0 = null;

        EObject lv_dependencies_5_0 = null;



        	enterRule();

        try {
            // InternalAirflow.g:113:2: ( (otherlv_0= 'Workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_tasks_4_0= ruleTask ) )* ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' ) )
            // InternalAirflow.g:114:2: (otherlv_0= 'Workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_tasks_4_0= ruleTask ) )* ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' )
            {
            // InternalAirflow.g:114:2: (otherlv_0= 'Workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_tasks_4_0= ruleTask ) )* ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}' )
            // InternalAirflow.g:115:3: otherlv_0= 'Workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_tasks_4_0= ruleTask ) )* ( (lv_dependencies_5_0= ruleDependency ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalAirflow.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAirflow.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAirflow.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalAirflow.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAirflow.g:141:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalAirflow.g:142:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalAirflow.g:142:4: (lv_description_3_0= RULE_STRING )
            // InternalAirflow.g:143:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_description_3_0, grammarAccess.getWorkflowAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAirflow.g:159:3: ( (lv_tasks_4_0= ruleTask ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAirflow.g:160:4: (lv_tasks_4_0= ruleTask )
            	    {
            	    // InternalAirflow.g:160:4: (lv_tasks_4_0= ruleTask )
            	    // InternalAirflow.g:161:5: lv_tasks_4_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowAccess().getTasksTaskParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_tasks_4_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_4_0,
            	    						"cloudautomation.Airflow.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAirflow.g:178:3: ( (lv_dependencies_5_0= ruleDependency ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAirflow.g:179:4: (lv_dependencies_5_0= ruleDependency )
            	    {
            	    // InternalAirflow.g:179:4: (lv_dependencies_5_0= ruleDependency )
            	    // InternalAirflow.g:180:5: lv_dependencies_5_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowAccess().getDependenciesDependencyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_dependencies_5_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_5_0,
            	    						"cloudautomation.Airflow.Dependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleTask"
    // InternalAirflow.g:205:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalAirflow.g:205:45: (iv_ruleTask= ruleTask EOF )
            // InternalAirflow.g:206:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalAirflow.g:212:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_priority_4_0= rulePriority ) ) ( (lv_type_5_0= ruleTaskType ) ) otherlv_6= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_6=null;
        EObject lv_priority_4_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalAirflow.g:218:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_priority_4_0= rulePriority ) ) ( (lv_type_5_0= ruleTaskType ) ) otherlv_6= '}' ) )
            // InternalAirflow.g:219:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_priority_4_0= rulePriority ) ) ( (lv_type_5_0= ruleTaskType ) ) otherlv_6= '}' )
            {
            // InternalAirflow.g:219:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_priority_4_0= rulePriority ) ) ( (lv_type_5_0= ruleTaskType ) ) otherlv_6= '}' )
            // InternalAirflow.g:220:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_priority_4_0= rulePriority ) ) ( (lv_type_5_0= ruleTaskType ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalAirflow.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAirflow.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAirflow.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalAirflow.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAirflow.g:246:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalAirflow.g:247:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalAirflow.g:247:4: (lv_description_3_0= RULE_STRING )
            // InternalAirflow.g:248:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_description_3_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAirflow.g:264:3: ( (lv_priority_4_0= rulePriority ) )
            // InternalAirflow.g:265:4: (lv_priority_4_0= rulePriority )
            {
            // InternalAirflow.g:265:4: (lv_priority_4_0= rulePriority )
            // InternalAirflow.g:266:5: lv_priority_4_0= rulePriority
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getPriorityPriorityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_priority_4_0=rulePriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_4_0,
            						"cloudautomation.Airflow.Priority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAirflow.g:283:3: ( (lv_type_5_0= ruleTaskType ) )
            // InternalAirflow.g:284:4: (lv_type_5_0= ruleTaskType )
            {
            // InternalAirflow.g:284:4: (lv_type_5_0= ruleTaskType )
            // InternalAirflow.g:285:5: lv_type_5_0= ruleTaskType
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getTypeTaskTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_5_0=ruleTaskType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"cloudautomation.Airflow.TaskType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDependency"
    // InternalAirflow.g:310:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalAirflow.g:310:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalAirflow.g:311:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalAirflow.g:317:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependsOn' ( (lv_task_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_taskId_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_task_1_0=null;
        Token otherlv_2=null;
        Token lv_taskId_3_0=null;


        	enterRule();

        try {
            // InternalAirflow.g:323:2: ( (otherlv_0= 'dependsOn' ( (lv_task_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_taskId_3_0= RULE_ID ) ) ) )
            // InternalAirflow.g:324:2: (otherlv_0= 'dependsOn' ( (lv_task_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_taskId_3_0= RULE_ID ) ) )
            {
            // InternalAirflow.g:324:2: (otherlv_0= 'dependsOn' ( (lv_task_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_taskId_3_0= RULE_ID ) ) )
            // InternalAirflow.g:325:3: otherlv_0= 'dependsOn' ( (lv_task_1_0= RULE_ID ) ) otherlv_2= 'on' ( (lv_taskId_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependsOnKeyword_0());
            		
            // InternalAirflow.g:329:3: ( (lv_task_1_0= RULE_ID ) )
            // InternalAirflow.g:330:4: (lv_task_1_0= RULE_ID )
            {
            // InternalAirflow.g:330:4: (lv_task_1_0= RULE_ID )
            // InternalAirflow.g:331:5: lv_task_1_0= RULE_ID
            {
            lv_task_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_task_1_0, grammarAccess.getDependencyAccess().getTaskIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"task",
            						lv_task_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getOnKeyword_2());
            		
            // InternalAirflow.g:351:3: ( (lv_taskId_3_0= RULE_ID ) )
            // InternalAirflow.g:352:4: (lv_taskId_3_0= RULE_ID )
            {
            // InternalAirflow.g:352:4: (lv_taskId_3_0= RULE_ID )
            // InternalAirflow.g:353:5: lv_taskId_3_0= RULE_ID
            {
            lv_taskId_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_taskId_3_0, grammarAccess.getDependencyAccess().getTaskIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskId",
            						lv_taskId_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRulePriority"
    // InternalAirflow.g:373:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // InternalAirflow.g:373:49: (iv_rulePriority= rulePriority EOF )
            // InternalAirflow.g:374:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // InternalAirflow.g:380:1: rulePriority returns [EObject current=null] : ( ( (lv_LOW_0_0= 'Low' ) ) | ( (lv_MEDIUM_1_0= 'Medium' ) ) | ( (lv_HIGH_2_0= 'High' ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token lv_LOW_0_0=null;
        Token lv_MEDIUM_1_0=null;
        Token lv_HIGH_2_0=null;


        	enterRule();

        try {
            // InternalAirflow.g:386:2: ( ( ( (lv_LOW_0_0= 'Low' ) ) | ( (lv_MEDIUM_1_0= 'Medium' ) ) | ( (lv_HIGH_2_0= 'High' ) ) ) )
            // InternalAirflow.g:387:2: ( ( (lv_LOW_0_0= 'Low' ) ) | ( (lv_MEDIUM_1_0= 'Medium' ) ) | ( (lv_HIGH_2_0= 'High' ) ) )
            {
            // InternalAirflow.g:387:2: ( ( (lv_LOW_0_0= 'Low' ) ) | ( (lv_MEDIUM_1_0= 'Medium' ) ) | ( (lv_HIGH_2_0= 'High' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAirflow.g:388:3: ( (lv_LOW_0_0= 'Low' ) )
                    {
                    // InternalAirflow.g:388:3: ( (lv_LOW_0_0= 'Low' ) )
                    // InternalAirflow.g:389:4: (lv_LOW_0_0= 'Low' )
                    {
                    // InternalAirflow.g:389:4: (lv_LOW_0_0= 'Low' )
                    // InternalAirflow.g:390:5: lv_LOW_0_0= 'Low'
                    {
                    lv_LOW_0_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_LOW_0_0, grammarAccess.getPriorityAccess().getLOWLowKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriorityRule());
                    					}
                    					setWithLastConsumed(current, "LOW", lv_LOW_0_0, "Low");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAirflow.g:403:3: ( (lv_MEDIUM_1_0= 'Medium' ) )
                    {
                    // InternalAirflow.g:403:3: ( (lv_MEDIUM_1_0= 'Medium' ) )
                    // InternalAirflow.g:404:4: (lv_MEDIUM_1_0= 'Medium' )
                    {
                    // InternalAirflow.g:404:4: (lv_MEDIUM_1_0= 'Medium' )
                    // InternalAirflow.g:405:5: lv_MEDIUM_1_0= 'Medium'
                    {
                    lv_MEDIUM_1_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_MEDIUM_1_0, grammarAccess.getPriorityAccess().getMEDIUMMediumKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriorityRule());
                    					}
                    					setWithLastConsumed(current, "MEDIUM", lv_MEDIUM_1_0, "Medium");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAirflow.g:418:3: ( (lv_HIGH_2_0= 'High' ) )
                    {
                    // InternalAirflow.g:418:3: ( (lv_HIGH_2_0= 'High' ) )
                    // InternalAirflow.g:419:4: (lv_HIGH_2_0= 'High' )
                    {
                    // InternalAirflow.g:419:4: (lv_HIGH_2_0= 'High' )
                    // InternalAirflow.g:420:5: lv_HIGH_2_0= 'High'
                    {
                    lv_HIGH_2_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_HIGH_2_0, grammarAccess.getPriorityAccess().getHIGHHighKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPriorityRule());
                    					}
                    					setWithLastConsumed(current, "HIGH", lv_HIGH_2_0, "High");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "entryRuleTaskType"
    // InternalAirflow.g:436:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // InternalAirflow.g:436:49: (iv_ruleTaskType= ruleTaskType EOF )
            // InternalAirflow.g:437:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskType"


    // $ANTLR start "ruleTaskType"
    // InternalAirflow.g:443:1: ruleTaskType returns [EObject current=null] : ( ( (lv_SIMPLE_0_0= 'Simple' ) ) | ( (lv_COMPOUND_1_0= 'Compound' ) ) ) ;
    public final EObject ruleTaskType() throws RecognitionException {
        EObject current = null;

        Token lv_SIMPLE_0_0=null;
        Token lv_COMPOUND_1_0=null;


        	enterRule();

        try {
            // InternalAirflow.g:449:2: ( ( ( (lv_SIMPLE_0_0= 'Simple' ) ) | ( (lv_COMPOUND_1_0= 'Compound' ) ) ) )
            // InternalAirflow.g:450:2: ( ( (lv_SIMPLE_0_0= 'Simple' ) ) | ( (lv_COMPOUND_1_0= 'Compound' ) ) )
            {
            // InternalAirflow.g:450:2: ( ( (lv_SIMPLE_0_0= 'Simple' ) ) | ( (lv_COMPOUND_1_0= 'Compound' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAirflow.g:451:3: ( (lv_SIMPLE_0_0= 'Simple' ) )
                    {
                    // InternalAirflow.g:451:3: ( (lv_SIMPLE_0_0= 'Simple' ) )
                    // InternalAirflow.g:452:4: (lv_SIMPLE_0_0= 'Simple' )
                    {
                    // InternalAirflow.g:452:4: (lv_SIMPLE_0_0= 'Simple' )
                    // InternalAirflow.g:453:5: lv_SIMPLE_0_0= 'Simple'
                    {
                    lv_SIMPLE_0_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_SIMPLE_0_0, grammarAccess.getTaskTypeAccess().getSIMPLESimpleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskTypeRule());
                    					}
                    					setWithLastConsumed(current, "SIMPLE", lv_SIMPLE_0_0, "Simple");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAirflow.g:466:3: ( (lv_COMPOUND_1_0= 'Compound' ) )
                    {
                    // InternalAirflow.g:466:3: ( (lv_COMPOUND_1_0= 'Compound' ) )
                    // InternalAirflow.g:467:4: (lv_COMPOUND_1_0= 'Compound' )
                    {
                    // InternalAirflow.g:467:4: (lv_COMPOUND_1_0= 'Compound' )
                    // InternalAirflow.g:468:5: lv_COMPOUND_1_0= 'Compound'
                    {
                    lv_COMPOUND_1_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_COMPOUND_1_0, grammarAccess.getTaskTypeAccess().getCOMPOUNDCompoundKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskTypeRule());
                    					}
                    					setWithLastConsumed(current, "COMPOUND", lv_COMPOUND_1_0, "Compound");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}