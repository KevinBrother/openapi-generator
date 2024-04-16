package org.openapitools.codegen.languages;

import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.SupportingFile;

import java.io.File;
import java.util.Map;

public class EasyJs extends DefaultCodegen {
    @Override
    public String getName() {
        return "easy-js";
    }

    @Override
    public String templateDir() {
        return getName();
    }

    @Override
    public void processOpts() {
        super.processOpts();
        modelTemplateFiles.put("model.mustache", ".ts");
        supportingFiles.add(new SupportingFile("gitignore.mustache", "", ".gitignore"));
    }
}
