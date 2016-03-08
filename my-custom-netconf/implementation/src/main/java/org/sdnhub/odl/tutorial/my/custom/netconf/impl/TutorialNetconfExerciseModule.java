package org.sdnhub.odl.tutorial.my.custom.netconf.impl;
public class TutorialNetconfExerciseModule extends org.sdnhub.odl.tutorial.my.custom.netconf.impl.AbstractTutorialNetconfExerciseModule {
    public TutorialNetconfExerciseModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public TutorialNetconfExerciseModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.sdnhub.odl.tutorial.my.custom.netconf.impl.TutorialNetconfExerciseModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        // TODO:implement
        throw new java.lang.UnsupportedOperationException();
    }

}
