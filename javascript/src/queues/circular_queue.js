/**
 * Initialize your data structure here. Set the size of the queue to be k.
 * @param {number} k
 */
var MyCircularQueue = function(k) {
  this.head = null;
  this.tail = null;
  this.queue = new Array(k).fill(null);
};

/**
 * Insert an element into the circular queue. Return true if the operation is successful.
 * @param {number} value
 * @return {boolean}
 */
MyCircularQueue.prototype.enQueue = function(value) {
  if (this.isFull()) {
    return false;
  }

  if (this.isEmpty()) {
    this.head = 0;
    this.tail = 0;
  } else if (this.tail === this.queue.length - 1) {
    this.tail = 0;
  } else {
    this.tail++;
  }

  this.queue[this.tail] = value;
  return true;
};

/**
 * Delete an element from the circular queue. Return true if the operation is successful.
 * @return {boolean}
 */
MyCircularQueue.prototype.deQueue = function() {
  if (this.isEmpty()) {
    return false;
  }

  if (this.head === this.tail) {
    this.head = null;
    this.tail = null;
  } else if (this.head === this.queue.length - 1) {
    this.head = 0;
  } else {
    this.head++;
  }

  return true;
};

/**
 * Get the front item from the queue.
 * @return {number}
 */
MyCircularQueue.prototype.Front = function() {
  return this.head !== null ? this.queue[this.head] : -1;
};

/**
 * Get the last item from the queue.
 * @return {number}
 */
MyCircularQueue.prototype.Rear = function() {
  return this.tail !== null ? this.queue[this.tail] : -1;
};

/**
 * Checks whether the circular queue is empty or not.
 * @return {boolean}
 */
MyCircularQueue.prototype.isEmpty = function() {
  return this.head === null && this.tail === null;
};

/**
 * Checks whether the circular queue is full or not.
 * @return {boolean}
 */
MyCircularQueue.prototype.isFull = function() {
  if (this.head === 0 && this.tail === this.queue.length - 1) {
    return true;
  }

  if (this.head - 1 === this.tail) {
    return true;
  }

  return false;
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = Object.create(MyCircularQueue).createNew(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */