package Calculator;

/**
* Calculator/CalcHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* domingo 20 de marzo de 2022 16H07' CET
*/

public final class CalcHolder implements org.omg.CORBA.portable.Streamable
{
  public Calculator.Calc value = null;

  public CalcHolder ()
  {
  }

  public CalcHolder (Calculator.Calc initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Calculator.CalcHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Calculator.CalcHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Calculator.CalcHelper.type ();
  }

}
