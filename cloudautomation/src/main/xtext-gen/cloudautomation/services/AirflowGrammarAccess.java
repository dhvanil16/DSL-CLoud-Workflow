/*
 * generated by Xtext 2.32.0
 */
package cloudautomation.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AirflowGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cloudautomation.Airflow.Model");
		private final Assignment cWorkflowsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cWorkflowsWorkflowParserRuleCall_0 = (RuleCall)cWorkflowsAssignment.eContents().get(0);
		
		//Model:
		//    workflows+=Workflow*;
		@Override public ParserRule getRule() { return rule; }
		
		//workflows+=Workflow*
		public Assignment getWorkflowsAssignment() { return cWorkflowsAssignment; }
		
		//Workflow
		public RuleCall getWorkflowsWorkflowParserRuleCall_0() { return cWorkflowsWorkflowParserRuleCall_0; }
	}
	public class WorkflowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cloudautomation.Airflow.Workflow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWorkflowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cTasksAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTasksTaskParserRuleCall_4_0 = (RuleCall)cTasksAssignment_4.eContents().get(0);
		private final Assignment cDependenciesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDependenciesDependencyParserRuleCall_5_0 = (RuleCall)cDependenciesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Workflow:
		//    'Workflow' name=ID '{'
		//        description=STRING
		//        tasks+=Task*
		//        dependencies+=Dependency*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Workflow' name=ID '{'
		//    description=STRING
		//    tasks+=Task*
		//    dependencies+=Dependency*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Workflow'
		public Keyword getWorkflowKeyword_0() { return cWorkflowKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0() { return cDescriptionSTRINGTerminalRuleCall_3_0; }
		
		//tasks+=Task*
		public Assignment getTasksAssignment_4() { return cTasksAssignment_4; }
		
		//Task
		public RuleCall getTasksTaskParserRuleCall_4_0() { return cTasksTaskParserRuleCall_4_0; }
		
		//dependencies+=Dependency*
		public Assignment getDependenciesAssignment_5() { return cDependenciesAssignment_5; }
		
		//Dependency
		public RuleCall getDependenciesDependencyParserRuleCall_5_0() { return cDependenciesDependencyParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cloudautomation.Airflow.Task");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cPriorityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPriorityPriorityParserRuleCall_4_0 = (RuleCall)cPriorityAssignment_4.eContents().get(0);
		private final Assignment cTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeTaskTypeParserRuleCall_5_0 = (RuleCall)cTypeAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Task:
		//    'Task' name=ID '{'
		//        description=STRING
		//        priority=Priority
		//        type=TaskType
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Task' name=ID '{'
		//    description=STRING
		//    priority=Priority
		//    type=TaskType
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Task'
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0() { return cDescriptionSTRINGTerminalRuleCall_3_0; }
		
		//priority=Priority
		public Assignment getPriorityAssignment_4() { return cPriorityAssignment_4; }
		
		//Priority
		public RuleCall getPriorityPriorityParserRuleCall_4_0() { return cPriorityPriorityParserRuleCall_4_0; }
		
		//type=TaskType
		public Assignment getTypeAssignment_5() { return cTypeAssignment_5; }
		
		//TaskType
		public RuleCall getTypeTaskTypeParserRuleCall_5_0() { return cTypeTaskTypeParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class DependencyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cloudautomation.Airflow.Dependency");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDependsOnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTaskAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTaskIDTerminalRuleCall_1_0 = (RuleCall)cTaskAssignment_1.eContents().get(0);
		private final Keyword cOnKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTaskIdAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTaskIdIDTerminalRuleCall_3_0 = (RuleCall)cTaskIdAssignment_3.eContents().get(0);
		
		//Dependency:
		//    'dependsOn' task=ID 'on' taskId=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'dependsOn' task=ID 'on' taskId=ID
		public Group getGroup() { return cGroup; }
		
		//'dependsOn'
		public Keyword getDependsOnKeyword_0() { return cDependsOnKeyword_0; }
		
		//task=ID
		public Assignment getTaskAssignment_1() { return cTaskAssignment_1; }
		
		//ID
		public RuleCall getTaskIDTerminalRuleCall_1_0() { return cTaskIDTerminalRuleCall_1_0; }
		
		//'on'
		public Keyword getOnKeyword_2() { return cOnKeyword_2; }
		
		//taskId=ID
		public Assignment getTaskIdAssignment_3() { return cTaskIdAssignment_3; }
		
		//ID
		public RuleCall getTaskIdIDTerminalRuleCall_3_0() { return cTaskIdIDTerminalRuleCall_3_0; }
	}
	public class PriorityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cloudautomation.Airflow.Priority");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cLOWAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cLOWLowKeyword_0_0 = (Keyword)cLOWAssignment_0.eContents().get(0);
		private final Assignment cMEDIUMAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cMEDIUMMediumKeyword_1_0 = (Keyword)cMEDIUMAssignment_1.eContents().get(0);
		private final Assignment cHIGHAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cHIGHHighKeyword_2_0 = (Keyword)cHIGHAssignment_2.eContents().get(0);
		
		//Priority:
		//    LOW = 'Low' | MEDIUM = 'Medium' | HIGH = 'High';
		@Override public ParserRule getRule() { return rule; }
		
		//LOW = 'Low' | MEDIUM = 'Medium' | HIGH = 'High'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LOW = 'Low'
		public Assignment getLOWAssignment_0() { return cLOWAssignment_0; }
		
		//'Low'
		public Keyword getLOWLowKeyword_0_0() { return cLOWLowKeyword_0_0; }
		
		//MEDIUM = 'Medium'
		public Assignment getMEDIUMAssignment_1() { return cMEDIUMAssignment_1; }
		
		//'Medium'
		public Keyword getMEDIUMMediumKeyword_1_0() { return cMEDIUMMediumKeyword_1_0; }
		
		//HIGH = 'High'
		public Assignment getHIGHAssignment_2() { return cHIGHAssignment_2; }
		
		//'High'
		public Keyword getHIGHHighKeyword_2_0() { return cHIGHHighKeyword_2_0; }
	}
	public class TaskTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cloudautomation.Airflow.TaskType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cSIMPLEAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cSIMPLESimpleKeyword_0_0 = (Keyword)cSIMPLEAssignment_0.eContents().get(0);
		private final Assignment cCOMPOUNDAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cCOMPOUNDCompoundKeyword_1_0 = (Keyword)cCOMPOUNDAssignment_1.eContents().get(0);
		
		//TaskType:
		//    SIMPLE = 'Simple' | COMPOUND = 'Compound';
		@Override public ParserRule getRule() { return rule; }
		
		//SIMPLE = 'Simple' | COMPOUND = 'Compound'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SIMPLE = 'Simple'
		public Assignment getSIMPLEAssignment_0() { return cSIMPLEAssignment_0; }
		
		//'Simple'
		public Keyword getSIMPLESimpleKeyword_0_0() { return cSIMPLESimpleKeyword_0_0; }
		
		//COMPOUND = 'Compound'
		public Assignment getCOMPOUNDAssignment_1() { return cCOMPOUNDAssignment_1; }
		
		//'Compound'
		public Keyword getCOMPOUNDCompoundKeyword_1_0() { return cCOMPOUNDCompoundKeyword_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final WorkflowElements pWorkflow;
	private final TaskElements pTask;
	private final DependencyElements pDependency;
	private final PriorityElements pPriority;
	private final TaskTypeElements pTaskType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AirflowGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pWorkflow = new WorkflowElements();
		this.pTask = new TaskElements();
		this.pDependency = new DependencyElements();
		this.pPriority = new PriorityElements();
		this.pTaskType = new TaskTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("cloudautomation.Airflow".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    workflows+=Workflow*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Workflow:
	//    'Workflow' name=ID '{'
	//        description=STRING
	//        tasks+=Task*
	//        dependencies+=Dependency*
	//    '}';
	public WorkflowElements getWorkflowAccess() {
		return pWorkflow;
	}
	
	public ParserRule getWorkflowRule() {
		return getWorkflowAccess().getRule();
	}
	
	//Task:
	//    'Task' name=ID '{'
	//        description=STRING
	//        priority=Priority
	//        type=TaskType
	//    '}';
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	//Dependency:
	//    'dependsOn' task=ID 'on' taskId=ID;
	public DependencyElements getDependencyAccess() {
		return pDependency;
	}
	
	public ParserRule getDependencyRule() {
		return getDependencyAccess().getRule();
	}
	
	//Priority:
	//    LOW = 'Low' | MEDIUM = 'Medium' | HIGH = 'High';
	public PriorityElements getPriorityAccess() {
		return pPriority;
	}
	
	public ParserRule getPriorityRule() {
		return getPriorityAccess().getRule();
	}
	
	//TaskType:
	//    SIMPLE = 'Simple' | COMPOUND = 'Compound';
	public TaskTypeElements getTaskTypeAccess() {
		return pTaskType;
	}
	
	public ParserRule getTaskTypeRule() {
		return getTaskTypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
