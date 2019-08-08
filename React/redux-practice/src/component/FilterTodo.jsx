import React from "react";
import "../App.css";

class FilterTodo extends React.Component {

  clickHandle = (event) => {
    this.props.displayFilter(event.target.name);
  }


  render() {
    return (
      <div>
        <button name="all" className="btn" onClick={this.clickHandle}>All</button>
        <button name="done" className="btn" onClick={this.clickHandle}>Done</button>
        <button name="notDone" className="btn" onClick={this.clickHandle}>Not Yet</button>
      </div>
    )
  }
}

export default FilterTodo;