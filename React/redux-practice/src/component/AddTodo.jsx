import React from "react";
import "../App.css";

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
          className="taskInput"
          value={this.state.newTask}
          onChange={this.handleInput}
          placeholder="Add a task here"
        />
        <button className="addBtn" onClick={this.handleClick}>+</button>
      </form>
    );
  }
}

export default AddTodo;