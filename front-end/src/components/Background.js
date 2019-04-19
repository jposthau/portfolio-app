import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';

const styles = theme => ({
  typography: {
    ...theme.mixins.gutters(),
    paddingTop: theme.spacing.unit * 2,
    paddingBottom: theme.spacing.unit * 2,
	position: 'absolute',
	top: '50%',
    left: '50%',
    marginRight: '-50%',
    transform: 'translate(-50%, -50%)',
	maxHeight: 'inherit',
	
  },
  background: {
	backgroundColor: '#3a6ee8',
	position: 'relative',
	minHeight: '30vh',
	display: 'flex',
    flexWrap: 'wrap',
  }
});

function Bio(props) {
  const { classes } = props;

  return (
    <div className={classes.background}>
        <Typography variant="h5" component="h3">
          Hi! My name is Jordan Posthauer and I am a software developer from Chicago
        </Typography>
        <Typography component="p">
          I am passionate about solving problems with quality software.
		  I specialize in backend development using Java, however I have
		  begun exposing myself to front end technologies such as React.
		  Please have a look around and see what I have accomplished using these technologies.
        </Typography>
    </div>
  );
}

Bio.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(Bio);