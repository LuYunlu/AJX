package org.a2o.domain.agent.service;

import dev.langchain4j.service.TokenStream;

public interface AgentStreamTest {

    TokenStream chat(String prompt);
}
