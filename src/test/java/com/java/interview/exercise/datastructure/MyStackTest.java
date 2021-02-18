package com.java.interview.exercise.datastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.EmptyStackException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MyStackTest {

    MyStack stack = new MyStack();

    @Test
    public void isEmptyReturnsTrueWhenEmpty(){
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    public void isEmptyReturnsFalseAfterPush(){
        stack.push(3);
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    public void peekReturnsTheLastInsertedElement(){
        stack.push(21);
        assertThat(stack.peek(), is(21));
    }

    @Test
    public void peekReturnsNullIfStackIsEmpty(){
        assertThat(stack.peek(), nullValue());
    }

    @Test
    public void popReturnsTheLastInsertedElementAfterDeletion(){
        stack.push(31);
        assertThat(stack.pop(), is(31));
    }

    @Test(expected = EmptyStackException.class)
    public void popThrowsExceptionWhenTryToRemoveFromEmptyStack(){
        stack.pop();
    }

    @Test
    public void peekReturnsNullAfterPopSingleElement(){
        stack.push(21);
        stack.pop();
        assertThat(stack.peek(), nullValue());
    }

    @Test
    public void isEmptyReturnsTrueWhenPopAfterPush(){
        stack.push(21);
        stack.pop();
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    public void peekReturnsFirstValueAfterPushTwiceAndPop(){
        stack.push(21);
        stack.push(31);
        stack.pop();
        assertThat(stack.peek(), is(21));
    }

    @Test
    public void containsReturnsTrueIfValueIsPresent(){
        stack.push(21);
        assertThat(stack.contains(21), is(true));
    }

    @Test
    public void containsReturnsFalseIfValueIsNotPresent(){
        stack.push(21);
        assertThat(stack.contains(1), is(false));
    }

    @Test
    public void sizeOfStack(){
        stack.push(21);
        stack.push(1);
        stack.pop();
        assertThat(stack.size(), is(1));
    }

    @Test
    public void peekReturnsTheElementAtSpecificIndex(){
        stack.push(21);
        stack.push(11);
        stack.push(71);
        stack.push(51);
        stack.push(31);
        assertThat(stack.peek(3), is(11));
    }

    @Test
    public void peekReturnsNullForIndexMoreThanSize(){
        stack.push(21);
        stack.push(31);
        assertThat(stack.peek(3), nullValue());
    }

    @Test (expected = IllegalArgumentException.class)
    public void peekThrowsIllegalArgumentExceptionForNegativeIndex(){
        stack.push(21);
        stack.push(31);
        stack.peek(-2);
    }
}