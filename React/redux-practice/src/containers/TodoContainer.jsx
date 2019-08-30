import React from 'react';
import TodoPage from '../component/TodoPage';
import { bindActionCreators } from 'redux';
import { connect } from 'react-redux';


class TodoContainer extends React.Component {
  render() {
    const { todos, clickTodo, addTodo } = this.props;
    return (
      <TodoPage {...this.props}/>
    );
  }
}

// Getter
// gets the state from store => converts to props 
function mapStateToProps(state) {

}

// Setter
// getting the actions to dispatch => 
function mapDispatchToProps(dispatch) {

}

export default connect(mapStateToProps, mapDispatchToProps)(TodoContainer);