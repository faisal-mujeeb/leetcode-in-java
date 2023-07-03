class MedianFinder {
    //Approach: Using PriorityQueue
    private Queue<Integer> smallHeap; //small elements - maxHeap
    private Queue<Integer> largeHeap; //large elements - minHeap
    public MedianFinder() {
        smallHeap = new PriorityQueue<>((a, b) -> b - a);
        largeHeap = new PriorityQueue<>((a, b) -> a - b);
    }
    
    public void addNum(int num) {
        //first add a value on the smallHeap
        smallHeap.add(num);

        //now separate them based on the large or small value
        //eek me se nikal ke dusre me dalna hai
        if(smallHeap.size()-largeHeap.size()>1 || !largeHeap.isEmpty() && smallHeap.peek()>largeHeap.peek()){
            largeHeap.add(smallHeap.poll());
        }
        if(largeHeap.size()-smallHeap.size()>1){
            smallHeap.add(largeHeap.poll());
        }
    }
    
    public double findMedian() {
        //we have three cases 
        //based on the we can get the solution
        if(smallHeap.size()==largeHeap.size()){
            return (double)(smallHeap.peek()+largeHeap.peek())/2;
        }
        else if(smallHeap.size()>largeHeap.size()){
            return (double) smallHeap.peek();
        }
        else{
            return (double) largeHeap.peek();
        }
    }
}
