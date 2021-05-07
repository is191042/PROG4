package at.ac.fhstp.gof.interpreter;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}