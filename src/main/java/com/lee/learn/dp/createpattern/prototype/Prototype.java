package com.lee.learn.dp.createpattern.prototype;

import java.io.*;

/**
 * Prototype Pattern, is the pattern that copy the object to create a new object.
 * It can be divided into shallow clone and deep clone
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private SerializableObject obj;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * is equivalent to clone() method
     * @return
     */
    public Object shallowClone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype)super.clone();
        return prototype;
    }

    /**
     * Using stream to implement deep clone
     * @return
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(this);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(in);
        return oi.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 2L;
}
