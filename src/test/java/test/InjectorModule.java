package test;

import com.google.inject.Binder;
import com.google.inject.Module;

public class InjectorModule implements Module {

    private static final SharedContext SHARED_CONTEXT = new SharedContext();

    public void configure(Binder binder) {
        binder.bind(SharedContext.class).toInstance(SHARED_CONTEXT);
    }

}
