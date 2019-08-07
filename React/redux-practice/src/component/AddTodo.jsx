import React from "react";

class AddTodo extends React.Component {
  state = {
    newTask: ''
  }

  handleInput = (event) => {
    this.setState({
      newTask: event.target.value
    })
  }

  handleClick = (event) => {
    event.preventDefault();
    this.props.handleInputValue(this.state.newTask);
    this.setState({
      newTask: ""
    })
  }

  render() {
    return (
      <form>
        <input
          type="text"
          value={this.state.newTask}
          onChange={this.handleInput}
          placeholder="Add a task here"
        />
        <button onClick={this.handleClick}>+</button>
      </form>
    );
  }
}

export default AddTodo;