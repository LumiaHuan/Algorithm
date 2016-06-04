# Algorithm
This is my algorithm's home

## Binary Search

1. recursive
2. non-recursive


## Bag, Queue, Stack

1. Bag: calculate mean and std
2. Bag (implemented by link list)
3. Queue(implemented by link list)
   * ReverseQueue(by a stack)
4. Queue(implemented by array)
   * ResizingArrayQueue
5. Stack(implemented by Array): 
   * Reverse input 
   * Dijkstra’s Two-Stack Algorithm for Expression Evaluation
   * FixedCapacityStackOfStrings(avoid loitering)
   * FixedCapacityStack, generic stack(avoid loitering)
     * add peek()
   * ResizedCapacityStack, foreach operation
     * add peek()
     * add copy()
6. Stack(implemented by link list):
   * Parentheses: uses a stack to determine whether string's parentheses are properly balanced.
   * Prints the binary representation of number N 
   * add peek()
   * add copy()
   * InfixToPostfix:converts an arithmetic expression from in- ﬁx to postﬁx.
   * EvaluatePostfix:calculate the result of postfix

## LinkedList

* boolean isEmpty()
* insert(T data): insert data into list's tail
* insert(T data, int index): insert data into the position after index, -1 to insert into head.
* T delete(): delete the last node and return the data.
* T delete(int k): delete the kth node.
* boolean find(T key): find some node has key
* int max(Node head): find the max value in link list( only has positive value).

## CircularLinkedListQueue

Queue implementation that uses a circular linked list, which is the same as a linked list except that no links are null and the value of last.next is first when- ever the list is not empty.

* boolean isEmpty()
* void enQueue(T data)
* T deQueue()