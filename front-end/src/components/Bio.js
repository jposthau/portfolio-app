import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';
import classNames from 'classnames';

const styles = theme => ({
    whiteText:{
        color: 'white',
    },
	centerAlign:{
		textAlign: 'center',
	}
});

function Bio(props) {
  const { classes } = props;

  return (
    <div>
        <Typography className={classNames(classes.whiteText, classes.centerAlign)} variant="h5" component="h3">
          Hi! My name is Jordan Posthauer and I am a software developer from Chicago
        </Typography>
        <Typography className={classNames(classes.whiteText)} component="p">
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