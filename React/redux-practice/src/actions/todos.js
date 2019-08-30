export const GET_TODOS = 'GET_TODOS';
export const ADD_TODO = 'ADD_TODO';
export const CLICK_TODO = 'CLICK_TODO';


export function getTodos(payload) {
  return function (dispatch) {
    dispatch({
      type: GET_TODOS,
      payload: { payload }
    })
  }
}

// payload = a newly added todo
export function addTodo(text) {
  return function (dispatch) {
    dispatch({
      type: ADD_TODO,
      payload: text
    })
  }
}

// payload = id 
export function clickTodo(id) {
  return function (dispatch) {
    dispatch({
      type: CLICK_TODO,
      payload: id
    })
  }
}
}