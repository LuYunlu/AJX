package org.a2o.application.memory.assembler;

import org.a2o.domain.memory.model.CandidateMemory;
import org.a2o.domain.memory.model.MemoryType;
import org.a2o.interfaces.dto.memory.CreateMemoryRequest;

public class MemoryCommandAssembler {

    public static CandidateMemory toCandidate(CreateMemoryRequest req) {
        CandidateMemory cm = new CandidateMemory();
        cm.setType(MemoryType.safeOf(req.getType()));
        cm.setText(req.getText());
        cm.setImportance(req.getImportance());
        cm.setTags(req.getTags());
        cm.setData(req.getData());
        return cm;
    }
}
