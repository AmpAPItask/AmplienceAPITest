
package com.amplience.pages;




public class Workflow {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workflow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
