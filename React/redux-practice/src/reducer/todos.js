// import {filterKeys} from '../constants/filterKeys';
import { GET_TODOS, ADD_TODO, CLICK_TODO, clickTodo } from '../actions/todos';

const initialState = {
  todoList: [],
  filterType: 'all'
}

export default function todos(state = initialState, action) {
  switch (action.type) {
    case GET_TODOS:
      return getTodos(state, action);
    case ADD_TODO:
      return addTodo(state, action);
    case CLICK_TODO:
      return clickTodo(state, action);
    default:
      return state;
  }
}

function getTodos(state, action) {
  return {
    ...state,
  }
}

function addTodo(state, action) {
  return {
    ...state,
    todos: [
      ...state.todos,
      {
        text: action.payload,
        isDone: false
      }
    ]
  }
}

function clickTodo(state, action) {
  const id = action.payload;
  let currentList = state.todos;

  currentList[id] = {
    ...currentList[id],
    isDone: !currentList[id].isDone
  }

  return {
    ...state,
    currentList
  }
}