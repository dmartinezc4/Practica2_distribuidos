package Calculator;


/**
* Calculator/CalcOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* domingo 20 de marzo de 2022 16H07' CET
*/

public interface CalcOperations 
{

  //Performs the Calculations:ADD/SUB/MUL/DIV
  int calculate (int _operator, int num1, int num2);

  //The Server EXITS when the Client prompts it to do so
  void shutdown ();
} // interface CalcOperations
