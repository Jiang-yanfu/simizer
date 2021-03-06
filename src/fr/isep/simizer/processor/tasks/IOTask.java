package fr.isep.simizer.processor.tasks;

/**
 * Represents a task that performs an IO operation.
 * <p>
 * This abstract class encompasses the shared behavior between all IO-related
 * tasks, such as the requirement to have a size.
 *
 * @author Sylvain Lefebvre
 */
public abstract class IOTask extends Task {

  /** The size of the operation. */
  private final long size;

  /**
   * Initializes a new task with the specified size.
   *
   * @param size the size of the operation
   */
  public IOTask(long size) {
    super();

    this.size = size;
  }

  /**
   * Returns the size of the IO operation.
   *
   * @return the size of the IO operation
   */
  public long getSize() {
    return size;
  }

}
