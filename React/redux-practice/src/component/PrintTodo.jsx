import React from "react";
import "../App.css";

class PrintTodo extends React.Component {
  render() {
    const { todoLists, onClickList, displayFilter } = this.props;

    let switchFilter = (todoList) => {
      switch (displayFilter) {
        case 'all':
          return true;
        case 'done':
          if (todoList.isDone) return true;
          break;
        case 'notDone':
          if (!todoList.isDone) return true;
          break;
        default:
          return false;
      }
    }

    let filteredList = todoLists.filter(renderFilter);

    return (
      <ul className="list">
        {filteredList.map((todoList, index) =>
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