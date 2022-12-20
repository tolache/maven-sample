package com.tolache.mavensample;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;

public class HeapChecker {
    public static String showHeapInfo() {
        StringBuilder heapInfo = new StringBuilder();

        for (MemoryPoolMXBean mpBean: ManagementFactory.getMemoryPoolMXBeans()) {
            if (mpBean.getType() == MemoryType.HEAP) {
                heapInfo.append(String.format("Name: %s: %s\n", mpBean.getName(), mpBean.getUsage()));
            }
        }

        if (heapInfo.toString().isEmpty()) {
            return "Sorry, could not check heap.";
        }

        return "\nHEAP INFO:\n" + heapInfo;
    }
}
