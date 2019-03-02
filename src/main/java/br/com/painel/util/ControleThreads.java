/*
 * The MIT License
 *
 * Copyright 2018 tiago.teixeira.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.painel.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tiago.teixeira
 */
public class ControleThreads implements Serializable {

    private static final Map<String, Thread> THREADS = new HashMap();
    private static final long serialVersionUID = 8265164238717014309L;

    public static Thread addThread(Thread thread) {
        THREADS.put(thread.getName(), thread);
        return thread;
    }

    public static void removeThead(String name) {
        Thread t = getThread(name);
        if (t != null) {
            t.interrupt();
            THREADS.remove(name);
        }
    }

    public static Thread getThread(String name) {
        if (THREADS.containsKey(name)) {
            return THREADS.get(name);
        }
        return null;
    }

    public static void autoInitThread(Thread thread) {
        removeThead(thread.getName());
        addThread(thread);
        getThread(thread.getName()).start();
    }

}
