package absyn;

import env.Env;
import env.Table;
import interpreter.Value;
import interpreter.ValueReal;
import interpreter.ValueVoid;
import io.vavr.collection.List;
import io.vavr.collection.Tree;
import types.VOID;
import types.Type;

public class ExpVoid extends Exp{

    public ExpVoid(Loc loc) {
        super(loc);
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpVoid: " + "nil"));
    }

    @Override
    protected Type semantic_(Env env) {
        return VOID.T;
    }

    @Override
    public Value eval(Table<Value> memory, List<Fun> functions) {
        return new ValueVoid();
    }
}
