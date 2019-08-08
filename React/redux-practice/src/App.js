import React from "react";

import AddTodo from "./component/AddTodo";
import PrintTodo from "./component/PrintTodo";
import SortTodo from "./component/SortTodo";
import "./App.css";

class App extends React.Component {
  state = {
    todoList: [],
    filterType: 'all'
  }

  addNewTask = (newTask) => {
    let currentList = this.state.todoList;
    currentList.push({
      task: newTask,
      isDone: false
    })

    this.setState({
      todoList: currentList
    })
  }

  setFilter = (filterType) => {
    this.setState({
      filterType: filterType
    })
  }

  onClickList = (index) => {
    let currentList = this.state.todoList;

    currentList[index] = {
      ...currentList[index],
      isDone: !currentList[index].isDone
    }

    this.setState({
      todoList: currentList
    })
  }

  render() {
    return (
      <div className="App">
        <AddTodo handleInputValue={this.addNewTask} />
        <SortTodo displayFilter={this.setFilter} />
        <PrintTodo todoLists={this.state.todoList} displayFilter={this.state.filterType} onClickList={this.onClickList} />
      </div>
    );
  }
}

export default App;
