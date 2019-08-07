import React from "react";

class PrintTodo extends React.Component {
  render() {
    const { todoLists, onClickList } = this.props;
    return (
      <ul>
        {todoLists.map((todoList, index) =>
          <li
            key={index}
            style={{ textDecoration: todoList.isDone ? "line-through" : "unset" }}
            onClick={() => onClickList(index)}
          >
            {todoList.task}
          </li>
        )}
      </ul>
    );
  }
}

export default PrintTodo;