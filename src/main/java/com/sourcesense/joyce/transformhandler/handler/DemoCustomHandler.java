package com.sourcesense.joyce.transformhandler.handler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.sourcesense.joyce.schemaengine.annotation.SchemaTransformationHandler;
import com.sourcesense.joyce.schemaengine.handler.SchemaTransformerHandler;
import org.pf4j.Extension;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Extension
@SchemaTransformationHandler(keyword = "$test")
public class DemoCustomHandler implements SchemaTransformerHandler {

    @Override
    public JsonNode process(
            String key,
            JsonNode value,
            JsonNode source,
            Optional<JsonNode> metadata,
            Optional<Object> context) {

        return new TextNode("result of custom handler processing");
    }
}
