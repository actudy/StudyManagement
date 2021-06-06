package com.yesjun.mgmt.util;

public class Dictionary {
    private class Entity {
        Object key;
        Object value;
    }

    Entity[] entities;
    int capacity;
    int usage;

    public Dictionary() {
        entities = new Entity[capacity];
        capacity = 0;
        usage = 0;
    }

    private boolean isFull() {
        return capacity == usage;
    }

    private Entity findEntity(Object key) {
        for(Entity entity : entities) {
            if(entity.key == key) {
                return entity;
            }
        }
        return null;
    }

    public boolean put(Object key, Object value) {
        Entity entity = null;
        if((entity = findEntity(key)) != null) {
            entity.value = value;
            return true;
        }
        entity = new Entity();
        entity.key = key;
        entity.value = value;

        if(isFull()) {
            capacity++;
            Entity[] temp = entities;
            entities = new Entity[capacity];
            System.arraycopy(temp, 0, entities, 0, usage);
        }
        entities[usage] = entity;
        usage++;
        return true;
    }

    public Object get(String key) {
        for(Entity entity : entities) {
            if(entity.key == key) {
                return entity.value;
            }
        }
        return null;
    }
}