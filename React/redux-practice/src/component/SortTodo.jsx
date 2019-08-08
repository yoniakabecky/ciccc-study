import React from "react";

class SortTodo extends React.Component {

  clickHandle = (event) => {
    this.props.displayFilter(event.target.name);
  }


  render() {
    return (
      <div>
        <button name="all" onClick={this.clickHandle}>All</button>
        <button name="done" onClick={this.clickHandle}>Done</button>
        <button name="notDone" onClick={this.clickHandle}>Not Yet</button>
      </div>
    )
  }
}

export default SortTodo;