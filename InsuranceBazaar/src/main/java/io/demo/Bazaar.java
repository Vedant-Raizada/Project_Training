package io.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bazaar {
    private Map<Object, Object> policyMap;

    public Map<Object, Object> getPolicyMap() {
        return policyMap;
    }

    public void setPolicyMap(TreeMap<Object,Object> treeMap) {
        this.policyMap = treeMap;
    }

    public void addPolicyDetails(int policyId, String policyName) {
        policyMap.put(policyId, policyName);
    }

    public List<Integer> searchBasedOnPolicyType(String policyType) {
        List<Integer> policies = new ArrayList<>();

        for (Object policyId : policyMap.keySet()) {
            if (((String) policyMap.get(policyId)).contains(policyType)) {
                policies.add((Integer) policyId);
            }
        }

        return policies;
    }
}