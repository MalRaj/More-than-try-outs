package annotation;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

import java.util.Set;

@SupportedAnnotationTypes("SampleAnnotation")
public class Annotation_Processor extends AbstractProcessor
{
    @Override
    public boolean process(
            Set<? extends TypeElement> annotations,
            RoundEnvironment roundEnv)
    {
        for (TypeElement typeElement : annotations)
        {
            Set<Modifier> modifiers = typeElement.getModifiers();

            if (!modifiers.contains(Modifier.FINAL)
                    || !modifiers.contains(Modifier.PUBLIC))
            {
                // Compile time error.
                processingEnv.getMessager().printMessage(Kind.ERROR, "method wasn't public and final", typeElement);
            }
        }

        // All PublicFinal annotations are handled by this Processor.
        return true;
    }
}
