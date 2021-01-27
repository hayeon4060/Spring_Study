package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.Examconsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam exam = new NewlecExam();
		Examconsole console= new GridExamConsole(exam);
		//Examconsole console = new InlineExamConsole(exam); //DI
		
		console.print();
	}

}
