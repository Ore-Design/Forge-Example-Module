package design.ore.examplemodule;

import ch.qos.logback.classic.Logger;
import design.ore.forge.api.annotations.ForgeModule;
import design.ore.forge.api.interfaces.IForgeModule;
import design.ore.forge.api.interfaces.IModuleContext;

@ForgeModule(value = "example-module", name = "Example Module", version = "0.0.0", rootPackage = "design.ore.examplemodule")
public class ExampleModule implements IForgeModule
{
    public static Logger LOG;

    @Override
    public void initialize(IModuleContext context)
    {
        LOG = context.getLog();

        LOG.info("Initializing Example Forge Module...");
    }
}
